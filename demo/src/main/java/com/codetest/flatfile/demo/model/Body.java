package com.codetest.flatfile.demo.model;

import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Record
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Body {
    @Field(at = 19, length = 14)
    private String referenceNo;

    @Field(at = 39, length = 16)
    private String amount;

}