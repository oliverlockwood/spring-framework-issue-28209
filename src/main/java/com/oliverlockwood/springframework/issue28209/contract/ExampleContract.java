/*
 * Copyright © 2020 Dalet - All Rights Reserved
 *
 * This file is part of Ooyala Flex.
 *
 * Unauthorized copying and/or distribution of this file or any other part of Ooyala Flex, via any medium,
 * is strictly prohibited.  Proprietary and confidential.
 */
package com.oliverlockwood.springframework.issue28209.contract;

import org.springframework.web.bind.annotation.GetMapping;


public interface ExampleContract {

    @GetMapping("/api/example")
    String example();

}
