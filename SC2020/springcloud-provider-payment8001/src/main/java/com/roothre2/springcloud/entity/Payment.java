package com.roothre2.springcloud.entity;

import lombok.*;

/**
 * @author Roothre2
 * @create 2020-09-02  21:55:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Payment {
    private Long id;
    private String serial;
}
