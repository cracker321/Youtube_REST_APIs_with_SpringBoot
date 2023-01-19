//package com.example.firstproject.Mapper;
//
//import com.example.firstproject.dto.CommentDto;
//import com.example.firstproject.entity.Comment;
//
//public class CommentMapper {
//
//    public static Comment toComment(CommentDto commentDto){ //- '개별 댓글 entity 객체인 Comment'를 '개별 댓글 dto 객체'로
//        // 변환시켜주는 메소드.
//        //'static'은 '클래스 메소드'를 선언할 때 사용됨
//        return new Comment( //23강 12:00~. '개별 댓글 CommentDto 객체를 만들어주는 생성 메소드 CommentDto'
//                commentDto.getId(),
//                commentDto.getArticle().getId(),
//                commentDto.getNickname(),
//                commentDto.getBody()
//        );
//    }
//}
