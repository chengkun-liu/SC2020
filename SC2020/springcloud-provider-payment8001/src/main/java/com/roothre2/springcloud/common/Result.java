package com.roothre2.springcloud.common;

import lombok.*;

/**
 * @author Roothre2
 * @create 2020-09-02  21:57:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Result<T> {
    private Integer code;
    private String message;
    private T      data;
}
