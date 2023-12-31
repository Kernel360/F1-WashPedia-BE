package com.kernel360.member.dto;

import com.kernel360.member.entity.Member;

import java.time.LocalDate;

/**
 * DTO for {@link com.kernel360.member.entity.Member}
 */
public record MemberDto(Integer memberNo,
                        String id,
                        String email,
                        String password,
                        String gender,
                        LocalDate birthdate,
                        LocalDate createdAt,
                        String createdBy,
                        LocalDate modifiedAt,
                        String modifiedBy,
                        String jwtToken
) {

    public static MemberDto of(
            Integer memberNo,
            String id,
            String email,
            String password,
            String gender,
            LocalDate birthdate,
            LocalDate createdAt,
            String createdBy,
            LocalDate modifiedAt,
            String modifiedBy,
            String jwtToken
    ) {
        return new MemberDto(
                memberNo,
                id,
                email,
                password,
                gender,
                birthdate,
                createdAt,
                createdBy,
                modifiedAt,
                modifiedBy,
                jwtToken
        );
    }

    public static MemberDto from(Member entity) {
        return MemberDto.of(
                entity.getMemberNo(),
                entity.getId(),
                entity.getEmail(),
                entity.getPassword(),
                entity.getGender(),
                entity.getBirthdate(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy(),
                null
        );
    }

    public Member toEntity(MemberDto memberDto) {
        return Member.of(
                this.memberNo,
                this.id,
                this.email,
                this.password,
                this.gender,
                this.birthdate
        );
    }

    /** joinMember **/
    public static MemberDto of(
            String id,
            String email,
            String password
    ){
        return new MemberDto(
                null,
                id,
                email,
                password,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }

    /** Login Binding **/
    public static MemberDto login(Member entity,String jwtToken) {
        return MemberDto.of(
                entity.getMemberNo(),
                entity.getId(),
                entity.getEmail(),
                null,
                entity.getGender(),
                entity.getBirthdate(),
                entity.getCreatedAt(),
                entity.getCreatedBy(),
                entity.getModifiedAt(),
                entity.getModifiedBy(),
                jwtToken
        );
    }

    /** Request Login **/
    public static MemberDto of(
            String id,
            String password
    ){
        return new MemberDto(
                null,
                id,
                null,
                password,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }
}