package hello.yunho.chatgpt.datasource

import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.chat.ChatCompletionChunk
import com.aallam.openai.api.image.ImageURL
import kotlinx.coroutines.flow.Flow

@OptIn(BetaOpenAI::class)
interface GPTDataSource {
    suspend fun sendChat(chat: String): Flow<ChatCompletionChunk>

    suspend fun requestCreateImage(prompt: String, numberOfImage: Int): Flow<List<ImageURL>>
}