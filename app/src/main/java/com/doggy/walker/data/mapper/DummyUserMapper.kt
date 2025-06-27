package com.doggy.walker.data.mapper

import com.doggy.walker.data.dto.response.DummyResponseDto
import com.doggy.walker.domain.model.entity.DummyUser
import javax.inject.Inject

class DummyUserMapper @Inject constructor() {
    //dto -> entity : 서버에서 받아온 데이터를 맵핑할 때
    fun mapDtoToEntity(dto : DummyResponseDto) : DummyUser {
        return DummyUser(
            profile = dto.avatar,
            firstName = dto.firstName,
            id = dto.id,
            lastName = dto.lastName,
        )
    }

    //entity -> dto : 서버에 데이터 보낼 때
    fun mapEntityToDto(entity : DummyUser) : DummyResponseDto {
        return DummyResponseDto(
            avatar = entity.profile,
            firstName = entity.firstName,
            id = entity.id,
            lastName = entity.lastName,
            email = ""
        )
    }
}