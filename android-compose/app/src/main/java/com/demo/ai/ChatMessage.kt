package com.demo.ai

/**
 * AI对话消息模型
 */
data class ChatMessage(
    val id: String,
    val content: String,
    val role: Role
)

enum class Role {
    USER,
    ASSISTANT
}
