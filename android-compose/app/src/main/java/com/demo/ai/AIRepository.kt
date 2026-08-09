package com.demo.ai

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * AI服务抽象层
 *
 * 实际项目中这里连接SSE/WebSocket AI接口
 */
interface AIRepository {
    fun streamChat(input: String): Flow<String>
}

class AIRepositoryImpl : AIRepository {

    override fun streamChat(input: String): Flow<String> = flow {
        val chunks = listOf(
            "正在分析设备数据...",
            "识别完成...",
            "生成AI结果..."
        )

        chunks.forEach {
            emit(it)
        }
    }
}
