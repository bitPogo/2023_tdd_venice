/*
 * Copyright (c) 2023 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import kotlin.jvm.JvmInline

@JvmInline
value class Layer(val value: String)

fun interface XMasTree {
    fun getTree(height: UInt): List<Layer>
}