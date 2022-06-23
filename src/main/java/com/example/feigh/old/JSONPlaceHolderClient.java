//package com.example.feigh;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//
//@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
//public interface SONPlaceHolderClient {
//    @RequestMapping(method = RequestMethod.GET, value = "/posts")
//    List getPosts();
//
////    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
////    Post getPostById(@PathVariable("postId") Long postId);
//}
