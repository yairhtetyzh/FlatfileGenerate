package com.codetest.flatfile.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;

import com.codetest.flatfile.demo.model.Body;
import com.codetest.flatfile.demo.model.Header;
import com.codetest.flatfile.demo.model.Trailer;

public class DemoApplication {

	public static void main(String[] args) {
		try {
			StreamFactory factory = StreamFactory.newInstance();
			ClassLoader classLoader = DemoApplication.class.getClassLoader();
			InputStream inputStream = classLoader.getResourceAsStream("flatfile.xml");
			if (inputStream != null) {
				factory.load(inputStream);
			}

			List<Body> bodyRecords = Arrays.asList(new Body("6813162459", "RM2.00"), new Body("2039229524", "RM10.00"),
					new Body("2299488320", "RM5.00"), new Body("3898335898", "RM1255.00"));

			BeanWriter out = factory.createWriter("flatFile", new FileWriter(new File("test2.TXT")));
			out.write(new Header());
			for (Body body : bodyRecords) {
				out.write(body);
			}
			out.write(new Trailer());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
