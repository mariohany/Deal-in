package com.dealin.app.core.domain.usecase


interface IUseCase<INPUT, OUTPUT> {
    suspend operator fun invoke(input: INPUT): Result<OUTPUT>
}

interface INoneInputUseCase<OUTPUT> {
    suspend operator fun invoke(): Result<OUTPUT>
}

interface INoneOutputUseCase<INPUT> {
    suspend operator fun invoke(input: INPUT): Result<Unit>
}

