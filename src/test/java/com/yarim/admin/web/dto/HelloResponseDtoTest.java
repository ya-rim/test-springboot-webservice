package com.yarim.admin.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombok_fnc_test(){
        //given
        String name1 = "test";
        int amount1 = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name1, amount1);

        //then
        assertThat(dto.getName()).isEqualTo(name1);
        assertThat(dto.getAmount()).isEqualTo(amount1);

    }
}
