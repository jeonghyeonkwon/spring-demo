package com.example.demo.home.controller;

import com.example.demo.home.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){

//        String str = "문자열";
//        int a = 50;
//        Integer a1 = 1;
//        List<int> lista = new ArrayList<>();
//        lista.add(1);
//        List<Integer> lista = new ArrayList<>();
//        lista.add(1);
//
//
//
//
//        long b = 500000L;
//        Long b1 = 21479999999L;
//
//        int[] array = new int[5]; // 정적 처음 크기 정해주고 쓰는거
//        array[0] = 1;
//        array[1] = 1;
//        array[2] = 1;
//        array[3] = 1;
//        array[4] = 1;
//
//
//        List<Long> list = new ArrayList();
//
//        list.add(1L);
//        list.add(2L);
//        list.add(3L);
//        list.add(4L);
//        list.add(5L);
//
//
        int i = 1;
        String st1 = new String("abc");
        String st2 = new String("abc");
        if(st1.equals(st2)){
            System.out.println("참");
        }else {
            System.out.println("거짓");
        }
        char c = 'c'; // 잘 안씀


//        for(int i = 0;i<10;i++){
//            System.out.println(i);
//        }


        return "hello world";
    }


    @GetMapping("/board")
    public String boardList(){


        return "리스트요청";
    }

    @PostMapping("/board")
    public ResponseEntity boardWrite(@RequestBody UserDto dto){
        //객체지향 4대 원칙
        dto.name ="아아아";
        System.out.println(dto.name);



        System.out.println(dto.getName());
        System.out.println(dto.getName2());
        System.out.println(dto.getName3());
        return new ResponseEntity( dto, HttpStatus.OK);
    }

    // controller(요청 받는 부분)
    // -> service(서비스 로직)[트랜젝션 처리]
    /**
     * 1. 주문서 데이터를 만든다 (잘 들어갔어)
     * 2. 색상, 갯수 같은 데이터를 insert 시킨다(DB 연결이 끊긴다)
     * 3. 사용자 주문서 하고 매핑한다 (안넘어옴)
    * */



    // 아이디 검증, 찾은 아이디하고 비밀번호가 일치하는가?, 접속기록
    // -> repository(DB)


    @GetMapping("/class")
    public String cs(){

        UserDto dto = new UserDto("name1","name2","name3");


        return "hello";
    }
}
