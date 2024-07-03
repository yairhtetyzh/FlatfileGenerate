package com.codetest.flatfile.demo.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

import lombok.Getter;
import lombok.Setter;

@Record
@Getter
@Setter
public class Header {
    @Field(at = 0, length = 1)
    private String recordType = "H";

    @Field(at = 13, length = 9)
    private String fileType = "FLAT_FILE";
}