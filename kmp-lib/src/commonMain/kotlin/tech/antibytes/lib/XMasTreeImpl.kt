/*
 * Copyright (c) 2023 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.lib

import kotlin.math.min

object XMasTreeImpl : XMasTree {
    private fun padding(
        height: UInt,
        level: UInt
    ): String {
        return if (height == 0u) {
            ""
        } else {
            "".padEnd(((height - level)-1u).toInt(), '_')
        }
    }
    
    private fun leaf(
        level: UInt
    ): String {
           return  "".padEnd(((level*2u)+1u).toInt(), '#')

    }

    override fun getTree(height: UInt): List<Layer> {
        val padding = padding(height, 0u)
        val trunk = listOf(
            Layer("${padding}|$padding"),
            Layer("${padding}|$padding"),
        )

        return List(height.toInt()) { idx ->
            val layer = idx.toUInt()
            val padding = padding(height,layer)
            Layer("$padding${leaf(layer)}$padding")
        }.plus(trunk)
    }
}
