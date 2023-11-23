//package com.example.demo;
//
//import org.apache.catalina.filters.CorsFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    // 昨天的拦截器注册
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //拦截
//        registry.addInterceptor(new TokenInterceptor())
//                // 对所有请求进行拦截
//                .addPathPatterns("/**")
//                // 排除 login请求
//                .excludePathPatterns("/login");
//    }
//
//    //解决跨域问题
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", buildConfig());
//        return new CorsFilter();
//    }
//
//    private CorsConfiguration buildConfig() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.addAllowedOrigin("*");
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.addAllowedHeader("*");
//        corsConfiguration.addAllowedMethod("*");
//
//        return corsConfiguration;
//    }
//}
