package com.getbouncer.scan.ui.util

import androidx.test.filters.SmallTest
import androidx.test.platform.app.InstrumentationRegistry
import com.getbouncer.scan.ui.test.R
import kotlin.test.assertEquals
import org.junit.Test

class ViewExtensionsTest {
    private val testContext = InstrumentationRegistry.getInstrumentation().context

    @Test
    @SmallTest
    fun getColorByRes_matches() {
        val color = testContext.getColorByRes(R.color.testColor)
        val alpha = color shr 24 and 0xFF
        val red = color shr 16 and 0xFF
        val green = color shr 8 and 0xFF
        val blue = color and 0xFF

        assertEquals(0xA1, alpha)
        assertEquals(0x1E, red)
        assertEquals(0x90, green)
        assertEquals(0xFF, blue)
    }
}
