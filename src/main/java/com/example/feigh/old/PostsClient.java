//package com.example.feigh;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.*;
//
//@FeignClient(name = "posts-client", url = "https://jsonplaceholder.typicode.com/posts")
//public interface PostsClient {
//    @GetMapping
//    List<PostDTO> getAllPosts();
//    //пути «/posts»
//    //Служба принимает параметр запроса с именем «userId»
//    //Полный путь к сервису будет выглядеть так: https://jsonplaceholder.typicode.com/posts?userId=1
//    @GetMapping
//    List<PostDTO> getAllCountriesByUserId(@RequestParam("userId") Integer userId);
//
//    //postId в качестве переменной пути
//    //https://jsonplaceholder.typicode.com/posts/{postId} ", который принимает postId в качестве переменной пути.
//    @GetMapping("{postId}")
//    PostDTO getPostByPostId(@PathVariable("postId") Integer postId);
//    // принимает тело публикации в формате JSON
//    @PostMapping
//    PostDTO create(@RequestBody PostDTO post);
//}
//
