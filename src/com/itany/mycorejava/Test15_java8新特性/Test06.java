package com.itany.mycorejava.Test15_java8新特性;

import java.util.function.*;

/**
 * @author 黄鹏程
 * @date 2023年09月14日17:11
 */
public class Test06 {
    public static void main(String[] args) {
//        Consumer<Integer> c= System.out::println;
//        c.accept(6);
//        User user=new User();
//        Consumer<String> c=user::setUsername;
//        c.accept("1111");
//
//        Supplier s=user::getUsername;
//        System.out.println(s.get());

//        Predicate p="aa"::equals;
//        System.out.println(p.test("aa"));

//        BiPredicate<String,String> bp=String::equals;
//        System.out.println(bp.test("aa","aa"));

        Supplier<User> s=User::new;
        User user=s.get();
        System.out.println(user);

        Function<String,User> f=User::new;
        User user1=f.apply("admin");
        System.out.println(user1);

        BiFunction<String,String,User> bf=User::new;
        User user2=bf.apply("alice","1234");
        System.out.println(user2);
    }
}
