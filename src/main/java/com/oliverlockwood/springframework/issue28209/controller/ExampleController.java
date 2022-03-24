/*
 * Copyright © 2020 Dalet - All Rights Reserved
 *
 * This file is part of Ooyala Flex.
 *
 * Unauthorized copying and/or distribution of this file or any other part of Ooyala Flex, via any medium,
 * is strictly prohibited.  Proprietary and confidential.
 */
package com.oliverlockwood.springframework.issue28209.controller;

import com.oliverlockwood.springframework.issue28209.ExampleInterface;
import com.oliverlockwood.springframework.issue28209.contract.ExampleContract;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@Slf4j
@RestController
public class ExampleController implements ExampleContract {

    private final ExampleInterface exampleInterface;


    @Override
    public String example() {

        exampleInterface.doSomething("blah");

        log.info("I did something");
        return "OK\n";
    }

}
