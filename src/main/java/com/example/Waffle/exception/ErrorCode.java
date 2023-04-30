package com.example.Waffle.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
@AllArgsConstructor
public enum ErrorCode {
    /*400 BAD_REQUEST : 잘못된 요청*/
    NO_USER(HttpStatus.BAD_REQUEST, "LOGIN-001", "일치하는 회원이 없습니다."),
    NO_PASSWORD(HttpStatus.BAD_REQUEST, "LOGIN-002", "비밀번호가 일치하지 않습니다."),
    EXPIRATION_ATK(HttpStatus.BAD_REQUEST, "LOGOUT-001", "엑세스 토큰이 만료되없습니다."),
    NO_GROUP(HttpStatus.BAD_REQUEST, "GROUP-001", "일치하는 그룹을 찾을 수 없습니다."),
    NO_ROOM(HttpStatus.BAD_REQUEST, "ROOM-001", "일치하는 룸을 찾을 수 없습니다."),
    CANT_FINDGROUP(HttpStatus.BAD_REQUEST, "GROUP-002", "그룹 목록을 조회할 수 없습니다."),
    CANT_FINDROOM(HttpStatus.BAD_REQUEST, "ROOM-002", "룸 목록을 조회할 수 없습니다."),
    TOO_MANY_PEOPLE(HttpStatus.BAD_REQUEST, "DM-001", "사용자가 너무 많습니다."),
    NO_DM(HttpStatus.BAD_REQUEST, "DM-002", "채팅방이 존재하지 않습니다."),
    CANT_FINDDMUSER(HttpStatus.BAD_REQUEST, "DM-004", "채팅방 사용자 목록을 불러올 수 없습니다"),
    CANT_FINDUSERDM(HttpStatus.BAD_REQUEST, "DM-005", "사용자의 채팅방 목록을 불러올 수 없습니다"),

    /*401 UNAUTHROIZED : 인증 안됨*/
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "AUTH-001", "리프레시 토큰이 유효하지 않습니다."),


    /*409 CONFLICT : Resource 의 현재 상태와 충돌. 보통 중복된 데이터 존재*/
    DUPLICATE_ID(HttpStatus.CONFLICT, "REGISTER-001", "아이디가 중복되었습니다."),
    DUPLICATE_GROUP_USER(HttpStatus.CONFLICT, "GROUP-003", "해당 그룹에 이미 사용자가 존재합니다."),
    DUPLICATE_ROOM_USER(HttpStatus.CONFLICT, "ROOM-003", "해당 룸에 이미 사용자가 존재합니다."),
    DUPLICATE_DM_USER(HttpStatus.CONFLICT, "DM-003", "해당 채팅방에 이미 존재하는 사용자입니다."),

    /*500 INTERNAL_SERVER_ERROR : 서버 오류*/
    INTER_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON-001", "서버 내부 오류 발생."),
    ;

    private HttpStatus httpStatus;
    private String code;
    private String message;
}
