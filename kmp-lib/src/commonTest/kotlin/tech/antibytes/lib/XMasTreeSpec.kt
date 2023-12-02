/*
 * Copyright (c) 2023 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import tech.antibytes.util.test.fulfils
import tech.antibytes.util.test.mustBe
import kotlin.js.JsName
import kotlin.test.Test

class XMasTreeSpec {
    @Test
    @JsName("fn1")
    fun `Given a height of 0 it returns only the stem`() {
        // Given
        val height: UInt = 0u

        // When
        val actual = XMasTreeImpl.getTree(height)

        // Then
        actual mustBe listOf(
            Layer("|"),
            Layer("|"),
        )
    }

    @Test
    @JsName("fn3")
    fun `Given a height of 1 it returns the stem and one layer`() {
        // Given
        val height: UInt = 1u

        // When
        val actual = XMasTreeImpl.getTree(height)

        // Then
        actual mustBe listOf(
            Layer("#"),
            Layer("|"),
            Layer("|"),
        )
    }

    @Test
    @JsName("fn4")
    fun `Given a height of 3 it returns the stem and 3 layers`() {
        // Given
        val height: UInt = 3u

        // When
        val actual = XMasTreeImpl.getTree(height)

        // Then
        actual mustBe listOf(
            Layer("__#__"),
            Layer("_###_"),
            Layer("#####"),
            Layer("__|__"),
            Layer("__|__"),
        )
    }

    @Test
    @JsName("fn5")
    fun `Given a height of 5 it returns the stem and 5 layers`() {
        // Given
        val height: UInt = 5u

        // When
        val actual = XMasTreeImpl.getTree(height)

        // Then
        actual mustBe listOf(
            Layer("____#____"),
            Layer("___###___"),
            Layer("__#####__"),
            Layer("_#######_"),
            Layer("#########"),
            Layer("____|____"),
            Layer("____|____"),
        )
    }

    @Test
    @JsName("fn0")
    fun `XMasTreeImpl fulfils XMasTree`() {
        XMasTreeImpl fulfils XMasTree::class
    }
}