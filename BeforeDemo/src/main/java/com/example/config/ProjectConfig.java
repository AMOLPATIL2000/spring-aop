package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.beans","com.example.aspect"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ProjectConfig {
}
