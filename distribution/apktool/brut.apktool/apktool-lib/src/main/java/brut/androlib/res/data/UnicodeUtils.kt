package brut.androlib.res.data

/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * transliterated from
 * https://android.googlesource.com/platform/frameworks/base/+/master/tools/aapt2/text/Unicode.cpp
 * and
 * https://android.googlesource.com/platform/frameworks/base/+/master/tools/aapt2/text/Unicode_data.cpp
 */
//package com.android.aaptcompiler

const val XID_START_FLAG = 1 shl 0
const val XID_CONTINUE_FLAG = 1 shl 1
const val XID_EITHER_FLAG = XID_START_FLAG or XID_CONTINUE_FLAG
private fun findCharacterProperties(utf32: Int): Int =
    when (utf32) {
        in 0x30..0x39 -> XID_CONTINUE_FLAG
        in 0x41..0x5a -> XID_EITHER_FLAG
        0x5f -> XID_CONTINUE_FLAG
        in 0x61..0x7a,
        0xaa,
        0xb5 -> XID_EITHER_FLAG
        0xb7 -> XID_CONTINUE_FLAG
        0xba,
        in 0xc0..0xd6,
        in 0xd8..0xf6,
        in 0xf8..0x2c1,
        in 0x2c6..0x2d1,
        in 0x2e0..0x2e4,
        0x2ec,
        0x2ee -> XID_EITHER_FLAG
        in 0x300..0x36f -> XID_CONTINUE_FLAG
        in 0x370..0x374,
        in 0x376..0x377,
        in 0x37b..0x37d,
        0x37f,
        0x386 -> XID_EITHER_FLAG
        0x387 -> XID_CONTINUE_FLAG
        in 0x388..0x38a,
        0x38c,
        in 0x38e..0x3a1,
        in 0x3a3..0x3f5,
        in 0x3f7..0x481 -> XID_EITHER_FLAG
        in 0x483..0x487 -> XID_CONTINUE_FLAG
        in 0x48a..0x52f,
        in 0x531..0x556,
        0x559,
        in 0x561..0x587 -> XID_EITHER_FLAG
        in 0x591..0x5bd,
        0x5bf,
        in 0x5c1..0x5c2,
        in 0x5c4..0x5c5,
        0x5c7 -> XID_CONTINUE_FLAG
        in 0x5d0..0x5ea,
        in 0x5f0..0x5f2 -> XID_EITHER_FLAG
        in 0x610..0x61a -> XID_CONTINUE_FLAG
        in 0x620..0x64a -> XID_EITHER_FLAG
        in 0x64b..0x669 -> XID_CONTINUE_FLAG
        in 0x66e..0x66f -> XID_EITHER_FLAG
        0x670 -> XID_CONTINUE_FLAG
        in 0x671..0x6d3,
        0x6d5 -> XID_EITHER_FLAG
        in 0x6d6..0x6dc,
        in 0x6df..0x6e4 -> XID_CONTINUE_FLAG
        in 0x6e5..0x6e6 -> XID_EITHER_FLAG
        in 0x6e7..0x6e8,
        in 0x6ea..0x6ed -> XID_CONTINUE_FLAG
        in 0x6ee..0x6ef -> XID_EITHER_FLAG
        in 0x6f0..0x6f9 -> XID_CONTINUE_FLAG
        in 0x6fa..0x6fc,
        0x6ff,
        0x710 -> XID_EITHER_FLAG
        0x711 -> XID_CONTINUE_FLAG
        in 0x712..0x72f -> XID_EITHER_FLAG
        in 0x730..0x74a -> XID_CONTINUE_FLAG
        in 0x74d..0x7a5 -> XID_EITHER_FLAG
        in 0x7a6..0x7b0 -> XID_CONTINUE_FLAG
        0x7b1 -> XID_EITHER_FLAG
        in 0x7c0..0x7c9 -> XID_CONTINUE_FLAG
        in 0x7ca..0x7ea -> XID_EITHER_FLAG
        in 0x7eb..0x7f3 -> XID_CONTINUE_FLAG
        in 0x7f4..0x7f5,
        0x7fa,
        in 0x800..0x815 -> XID_EITHER_FLAG
        in 0x816..0x819 -> XID_CONTINUE_FLAG
        0x81a -> XID_EITHER_FLAG
        in 0x81b..0x823 -> XID_CONTINUE_FLAG
        0x824 -> XID_EITHER_FLAG
        in 0x825..0x827 -> XID_CONTINUE_FLAG
        0x828 -> XID_EITHER_FLAG
        in 0x829..0x82d -> XID_CONTINUE_FLAG
        in 0x840..0x858 -> XID_EITHER_FLAG
        in 0x859..0x85b -> XID_CONTINUE_FLAG
        in 0x8a0..0x8b4,
        in 0x8b6..0x8bd -> XID_EITHER_FLAG
        in 0x8d4..0x8e1,
        in 0x8e3..0x903 -> XID_CONTINUE_FLAG
        in 0x904..0x939 -> XID_EITHER_FLAG
        in 0x93a..0x93c -> XID_CONTINUE_FLAG
        0x93d -> XID_EITHER_FLAG
        in 0x93e..0x94f -> XID_CONTINUE_FLAG
        0x950 -> XID_EITHER_FLAG
        in 0x951..0x957 -> XID_CONTINUE_FLAG
        in 0x958..0x961 -> XID_EITHER_FLAG
        in 0x962..0x963,
        in 0x966..0x96f -> XID_CONTINUE_FLAG
        in 0x971..0x980 -> XID_EITHER_FLAG
        in 0x981..0x983 -> XID_CONTINUE_FLAG
        in 0x985..0x98c,
        in 0x98f..0x990,
        in 0x993..0x9a8,
        in 0x9aa..0x9b0,
        0x9b2,
        in 0x9b6..0x9b9 -> XID_EITHER_FLAG
        0x9bc -> XID_CONTINUE_FLAG
        0x9bd -> XID_EITHER_FLAG
        in 0x9be..0x9c4,
        in 0x9c7..0x9c8,
        in 0x9cb..0x9cd -> XID_CONTINUE_FLAG
        0x9ce -> XID_EITHER_FLAG
        0x9d7 -> XID_CONTINUE_FLAG
        in 0x9dc..0x9dd,
        in 0x9df..0x9e1 -> XID_EITHER_FLAG
        in 0x9e2..0x9e3,
        in 0x9e6..0x9ef -> XID_CONTINUE_FLAG
        in 0x9f0..0x9f1 -> XID_EITHER_FLAG
        in 0xa01..0xa03 -> XID_CONTINUE_FLAG
        in 0xa05..0xa0a,
        in 0xa0f..0xa10,
        in 0xa13..0xa28,
        in 0xa2a..0xa30,
        in 0xa32..0xa33,
        in 0xa35..0xa36,
        in 0xa38..0xa39 -> XID_EITHER_FLAG
        0xa3c,
        in 0xa3e..0xa42,
        in 0xa47..0xa48,
        in 0xa4b..0xa4d,
        0xa51 -> XID_CONTINUE_FLAG
        in 0xa59..0xa5c,
        0xa5e -> XID_EITHER_FLAG
        in 0xa66..0xa71 -> XID_CONTINUE_FLAG
        in 0xa72..0xa74 -> XID_EITHER_FLAG
        0xa75,
        in 0xa81..0xa83 -> XID_CONTINUE_FLAG
        in 0xa85..0xa8d,
        in 0xa8f..0xa91,
        in 0xa93..0xaa8,
        in 0xaaa..0xab0,
        in 0xab2..0xab3,
        in 0xab5..0xab9 -> XID_EITHER_FLAG
        0xabc -> XID_CONTINUE_FLAG
        0xabd -> XID_EITHER_FLAG
        in 0xabe..0xac5,
        in 0xac7..0xac9,
        in 0xacb..0xacd -> XID_CONTINUE_FLAG
        0xad0,
        in 0xae0..0xae1 -> XID_EITHER_FLAG
        in 0xae2..0xae3,
        in 0xae6..0xaef -> XID_CONTINUE_FLAG
        0xaf9 -> XID_EITHER_FLAG
        in 0xb01..0xb03 -> XID_CONTINUE_FLAG
        in 0xb05..0xb0c,
        in 0xb0f..0xb10,
        in 0xb13..0xb28,
        in 0xb2a..0xb30,
        in 0xb32..0xb33,
        in 0xb35..0xb39 -> XID_EITHER_FLAG
        0xb3c -> XID_CONTINUE_FLAG
        0xb3d -> XID_EITHER_FLAG
        in 0xb3e..0xb44,
        in 0xb47..0xb48,
        in 0xb4b..0xb4d,
        in 0xb56..0xb57 -> XID_CONTINUE_FLAG
        in 0xb5c..0xb5d,
        in 0xb5f..0xb61 -> XID_EITHER_FLAG
        in 0xb62..0xb63,
        in 0xb66..0xb6f -> XID_CONTINUE_FLAG
        0xb71 -> XID_EITHER_FLAG
        0xb82 -> XID_CONTINUE_FLAG
        0xb83,
        in 0xb85..0xb8a,
        in 0xb8e..0xb90,
        in 0xb92..0xb95,
        in 0xb99..0xb9a,
        0xb9c,
        in 0xb9e..0xb9f,
        in 0xba3..0xba4,
        in 0xba8..0xbaa,
        in 0xbae..0xbb9 -> XID_EITHER_FLAG
        in 0xbbe..0xbc2,
        in 0xbc6..0xbc8,
        in 0xbca..0xbcd -> XID_CONTINUE_FLAG
        0xbd0 -> XID_EITHER_FLAG
        0xbd7,
        in 0xbe6..0xbef,
        in 0xc00..0xc03 -> XID_CONTINUE_FLAG
        in 0xc05..0xc0c,
        in 0xc0e..0xc10,
        in 0xc12..0xc28,
        in 0xc2a..0xc39,
        0xc3d -> XID_EITHER_FLAG
        in 0xc3e..0xc44,
        in 0xc46..0xc48,
        in 0xc4a..0xc4d,
        in 0xc55..0xc56 -> XID_CONTINUE_FLAG
        in 0xc58..0xc5a,
        in 0xc60..0xc61 -> XID_EITHER_FLAG
        in 0xc62..0xc63,
        in 0xc66..0xc6f -> XID_CONTINUE_FLAG
        0xc80 -> XID_EITHER_FLAG
        in 0xc81..0xc83 -> XID_CONTINUE_FLAG
        in 0xc85..0xc8c,
        in 0xc8e..0xc90,
        in 0xc92..0xca8,
        in 0xcaa..0xcb3,
        in 0xcb5..0xcb9 -> XID_EITHER_FLAG
        0xcbc -> XID_CONTINUE_FLAG
        0xcbd -> XID_EITHER_FLAG
        in 0xcbe..0xcc4,
        in 0xcc6..0xcc8,
        in 0xcca..0xccd,
        in 0xcd5..0xcd6 -> XID_CONTINUE_FLAG
        0xcde,
        in 0xce0..0xce1 -> XID_EITHER_FLAG
        in 0xce2..0xce3,
        in 0xce6..0xcef -> XID_CONTINUE_FLAG
        in 0xcf1..0xcf2 -> XID_EITHER_FLAG
        in 0xd01..0xd03 -> XID_CONTINUE_FLAG
        in 0xd05..0xd0c,
        in 0xd0e..0xd10,
        in 0xd12..0xd3a,
        0xd3d -> XID_EITHER_FLAG
        in 0xd3e..0xd44,
        in 0xd46..0xd48,
        in 0xd4a..0xd4d -> XID_CONTINUE_FLAG
        0xd4e,
        in 0xd54..0xd56 -> XID_EITHER_FLAG
        0xd57 -> XID_CONTINUE_FLAG
        in 0xd5f..0xd61 -> XID_EITHER_FLAG
        in 0xd62..0xd63,
        in 0xd66..0xd6f -> XID_CONTINUE_FLAG
        in 0xd7a..0xd7f -> XID_EITHER_FLAG
        in 0xd82..0xd83 -> XID_CONTINUE_FLAG
        in 0xd85..0xd96,
        in 0xd9a..0xdb1,
        in 0xdb3..0xdbb,
        0xdbd,
        in 0xdc0..0xdc6 -> XID_EITHER_FLAG
        0xdca,
        in 0xdcf..0xdd4,
        0xdd6,
        in 0xdd8..0xddf,
        in 0xde6..0xdef,
        in 0xdf2..0xdf3 -> XID_CONTINUE_FLAG
        in 0xe01..0xe30 -> XID_EITHER_FLAG
        0xe31 -> XID_CONTINUE_FLAG
        0xe32 -> XID_EITHER_FLAG
        in 0xe33..0xe3a -> XID_CONTINUE_FLAG
        in 0xe40..0xe46 -> XID_EITHER_FLAG
        in 0xe47..0xe4e,
        in 0xe50..0xe59 -> XID_CONTINUE_FLAG
        in 0xe81..0xe82,
        0xe84,
        in 0xe87..0xe88,
        0xe8a,
        0xe8d,
        in 0xe94..0xe97,
        in 0xe99..0xe9f,
        in 0xea1..0xea3,
        0xea5,
        0xea7,
        in 0xeaa..0xeab,
        in 0xead..0xeb0 -> XID_EITHER_FLAG
        0xeb1 -> XID_CONTINUE_FLAG
        0xeb2 -> XID_EITHER_FLAG
        in 0xeb3..0xeb9,
        in 0xebb..0xebc -> XID_CONTINUE_FLAG
        0xebd,
        in 0xec0..0xec4,
        0xec6 -> XID_EITHER_FLAG
        in 0xec8..0xecd,
        in 0xed0..0xed9 -> XID_CONTINUE_FLAG
        in 0xedc..0xedf,
        0xf00 -> XID_EITHER_FLAG
        in 0xf18..0xf19,
        in 0xf20..0xf29,
        0xf35,
        0xf37,
        0xf39,
        in 0xf3e..0xf3f -> XID_CONTINUE_FLAG
        in 0xf40..0xf47,
        in 0xf49..0xf6c -> XID_EITHER_FLAG
        in 0xf71..0xf84,
        in 0xf86..0xf87 -> XID_CONTINUE_FLAG
        in 0xf88..0xf8c -> XID_EITHER_FLAG
        in 0xf8d..0xf97,
        in 0xf99..0xfbc,
        0xfc6 -> XID_CONTINUE_FLAG
        in 0x1000..0x102a -> XID_EITHER_FLAG
        in 0x102b..0x103e -> XID_CONTINUE_FLAG
        0x103f -> XID_EITHER_FLAG
        in 0x1040..0x1049 -> XID_CONTINUE_FLAG
        in 0x1050..0x1055 -> XID_EITHER_FLAG
        in 0x1056..0x1059 -> XID_CONTINUE_FLAG
        in 0x105a..0x105d -> XID_EITHER_FLAG
        in 0x105e..0x1060 -> XID_CONTINUE_FLAG
        0x1061 -> XID_EITHER_FLAG
        in 0x1062..0x1064 -> XID_CONTINUE_FLAG
        in 0x1065..0x1066 -> XID_EITHER_FLAG
        in 0x1067..0x106d -> XID_CONTINUE_FLAG
        in 0x106e..0x1070 -> XID_EITHER_FLAG
        in 0x1071..0x1074 -> XID_CONTINUE_FLAG
        in 0x1075..0x1081 -> XID_EITHER_FLAG
        in 0x1082..0x108d -> XID_CONTINUE_FLAG
        0x108e -> XID_EITHER_FLAG
        in 0x108f..0x109d -> XID_CONTINUE_FLAG
        in 0x10a0..0x10c5,
        0x10c7,
        0x10cd,
        in 0x10d0..0x10fa,
        in 0x10fc..0x1248,
        in 0x124a..0x124d,
        in 0x1250..0x1256,
        0x1258,
        in 0x125a..0x125d,
        in 0x1260..0x1288,
        in 0x128a..0x128d,
        in 0x1290..0x12b0,
        in 0x12b2..0x12b5,
        in 0x12b8..0x12be,
        0x12c0,
        in 0x12c2..0x12c5,
        in 0x12c8..0x12d6,
        in 0x12d8..0x1310,
        in 0x1312..0x1315,
        in 0x1318..0x135a -> XID_EITHER_FLAG
        in 0x135d..0x135f,
        in 0x1369..0x1371 -> XID_CONTINUE_FLAG
        in 0x1380..0x138f,
        in 0x13a0..0x13f5,
        in 0x13f8..0x13fd,
        in 0x1401..0x166c,
        in 0x166f..0x167f,
        in 0x1681..0x169a,
        in 0x16a0..0x16ea,
        in 0x16ee..0x16f8,
        in 0x1700..0x170c,
        in 0x170e..0x1711 -> XID_EITHER_FLAG
        in 0x1712..0x1714 -> XID_CONTINUE_FLAG
        in 0x1720..0x1731 -> XID_EITHER_FLAG
        in 0x1732..0x1734 -> XID_CONTINUE_FLAG
        in 0x1740..0x1751 -> XID_EITHER_FLAG
        in 0x1752..0x1753 -> XID_CONTINUE_FLAG
        in 0x1760..0x176c,
        in 0x176e..0x1770 -> XID_EITHER_FLAG
        in 0x1772..0x1773 -> XID_CONTINUE_FLAG
        in 0x1780..0x17b3 -> XID_EITHER_FLAG
        in 0x17b4..0x17d3 -> XID_CONTINUE_FLAG
        0x17d7,
        0x17dc -> XID_EITHER_FLAG
        0x17dd,
        in 0x17e0..0x17e9,
        in 0x180b..0x180d,
        in 0x1810..0x1819 -> XID_CONTINUE_FLAG
        in 0x1820..0x1877,
        in 0x1880..0x18a8 -> XID_EITHER_FLAG
        0x18a9 -> XID_CONTINUE_FLAG
        0x18aa,
        in 0x18b0..0x18f5,
        in 0x1900..0x191e -> XID_EITHER_FLAG
        in 0x1920..0x192b,
        in 0x1930..0x193b,
        in 0x1946..0x194f -> XID_CONTINUE_FLAG
        in 0x1950..0x196d,
        in 0x1970..0x1974,
        in 0x1980..0x19ab,
        in 0x19b0..0x19c9 -> XID_EITHER_FLAG
        in 0x19d0..0x19da -> XID_CONTINUE_FLAG
        in 0x1a00..0x1a16 -> XID_EITHER_FLAG
        in 0x1a17..0x1a1b -> XID_CONTINUE_FLAG
        in 0x1a20..0x1a54 -> XID_EITHER_FLAG
        in 0x1a55..0x1a5e,
        in 0x1a60..0x1a7c,
        in 0x1a7f..0x1a89,
        in 0x1a90..0x1a99 -> XID_CONTINUE_FLAG
        0x1aa7 -> XID_EITHER_FLAG
        in 0x1ab0..0x1abd,
        in 0x1b00..0x1b04 -> XID_CONTINUE_FLAG
        in 0x1b05..0x1b33 -> XID_EITHER_FLAG
        in 0x1b34..0x1b44 -> XID_CONTINUE_FLAG
        in 0x1b45..0x1b4b -> XID_EITHER_FLAG
        in 0x1b50..0x1b59,
        in 0x1b6b..0x1b73,
        in 0x1b80..0x1b82 -> XID_CONTINUE_FLAG
        in 0x1b83..0x1ba0 -> XID_EITHER_FLAG
        in 0x1ba1..0x1bad -> XID_CONTINUE_FLAG
        in 0x1bae..0x1baf -> XID_EITHER_FLAG
        in 0x1bb0..0x1bb9 -> XID_CONTINUE_FLAG
        in 0x1bba..0x1be5 -> XID_EITHER_FLAG
        in 0x1be6..0x1bf3 -> XID_CONTINUE_FLAG
        in 0x1c00..0x1c23 -> XID_EITHER_FLAG
        in 0x1c24..0x1c37,
        in 0x1c40..0x1c49 -> XID_CONTINUE_FLAG
        in 0x1c4d..0x1c4f -> XID_EITHER_FLAG
        in 0x1c50..0x1c59 -> XID_CONTINUE_FLAG
        in 0x1c5a..0x1c7d,
        in 0x1c80..0x1c88 -> XID_EITHER_FLAG
        in 0x1cd0..0x1cd2,
        in 0x1cd4..0x1ce8 -> XID_CONTINUE_FLAG
        in 0x1ce9..0x1cec -> XID_EITHER_FLAG
        0x1ced -> XID_CONTINUE_FLAG
        in 0x1cee..0x1cf1 -> XID_EITHER_FLAG
        in 0x1cf2..0x1cf4 -> XID_CONTINUE_FLAG
        in 0x1cf5..0x1cf6 -> XID_EITHER_FLAG
        in 0x1cf8..0x1cf9 -> XID_CONTINUE_FLAG
        in 0x1d00..0x1dbf -> XID_EITHER_FLAG
        in 0x1dc0..0x1df5,
        in 0x1dfb..0x1dff -> XID_CONTINUE_FLAG
        in 0x1e00..0x1f15,
        in 0x1f18..0x1f1d,
        in 0x1f20..0x1f45,
        in 0x1f48..0x1f4d,
        in 0x1f50..0x1f57,
        0x1f59,
        0x1f5b,
        0x1f5d,
        in 0x1f5f..0x1f7d,
        in 0x1f80..0x1fb4,
        in 0x1fb6..0x1fbc,
        0x1fbe,
        in 0x1fc2..0x1fc4,
        in 0x1fc6..0x1fcc,
        in 0x1fd0..0x1fd3,
        in 0x1fd6..0x1fdb,
        in 0x1fe0..0x1fec,
        in 0x1ff2..0x1ff4,
        in 0x1ff6..0x1ffc -> XID_EITHER_FLAG
        in 0x203f..0x2040,
        0x2054 -> XID_CONTINUE_FLAG
        0x2071,
        0x207f,
        in 0x2090..0x209c -> XID_EITHER_FLAG
        in 0x20d0..0x20dc,
        0x20e1,
        in 0x20e5..0x20f0 -> XID_CONTINUE_FLAG
        0x2102,
        0x2107,
        in 0x210a..0x2113,
        0x2115,
        in 0x2118..0x211d,
        0x2124,
        0x2126,
        0x2128,
        in 0x212a..0x2139,
        in 0x213c..0x213f,
        in 0x2145..0x2149,
        0x214e,
        in 0x2160..0x2188,
        in 0x2c00..0x2c2e,
        in 0x2c30..0x2c5e,
        in 0x2c60..0x2ce4,
        in 0x2ceb..0x2cee -> XID_EITHER_FLAG
        in 0x2cef..0x2cf1 -> XID_CONTINUE_FLAG
        in 0x2cf2..0x2cf3,
        in 0x2d00..0x2d25,
        0x2d27,
        0x2d2d,
        in 0x2d30..0x2d67,
        0x2d6f -> XID_EITHER_FLAG
        0x2d7f -> XID_CONTINUE_FLAG
        in 0x2d80..0x2d96,
        in 0x2da0..0x2da6,
        in 0x2da8..0x2dae,
        in 0x2db0..0x2db6,
        in 0x2db8..0x2dbe,
        in 0x2dc0..0x2dc6,
        in 0x2dc8..0x2dce,
        in 0x2dd0..0x2dd6,
        in 0x2dd8..0x2dde -> XID_EITHER_FLAG
        in 0x2de0..0x2dff -> XID_CONTINUE_FLAG
        in 0x3005..0x3007,
        in 0x3021..0x3029 -> XID_EITHER_FLAG
        in 0x302a..0x302f -> XID_CONTINUE_FLAG
        in 0x3031..0x3035,
        in 0x3038..0x303c,
        in 0x3041..0x3096 -> XID_EITHER_FLAG
        in 0x3099..0x309a -> XID_CONTINUE_FLAG
        in 0x309d..0x309f,
        in 0x30a1..0x30fa,
        in 0x30fc..0x30ff,
        in 0x3105..0x312d,
        in 0x3131..0x318e,
        in 0x31a0..0x31ba,
        in 0x31f0..0x31ff,
        in 0x3400..0x4db5,
        in 0x4e00..0x9fd5,
        in 0xa000..0xa48c,
        in 0xa4d0..0xa4fd,
        in 0xa500..0xa60c,
        in 0xa610..0xa61f -> XID_EITHER_FLAG
        in 0xa620..0xa629 -> XID_CONTINUE_FLAG
        in 0xa62a..0xa62b,
        in 0xa640..0xa66e -> XID_EITHER_FLAG
        0xa66f,
        in 0xa674..0xa67d -> XID_CONTINUE_FLAG
        in 0xa67f..0xa69d -> XID_EITHER_FLAG
        in 0xa69e..0xa69f -> XID_CONTINUE_FLAG
        in 0xa6a0..0xa6ef -> XID_EITHER_FLAG
        in 0xa6f0..0xa6f1 -> XID_CONTINUE_FLAG
        in 0xa717..0xa71f,
        in 0xa722..0xa788,
        in 0xa78b..0xa7ae,
        in 0xa7b0..0xa7b7,
        in 0xa7f7..0xa801 -> XID_EITHER_FLAG
        0xa802 -> XID_CONTINUE_FLAG
        in 0xa803..0xa805 -> XID_EITHER_FLAG
        0xa806 -> XID_CONTINUE_FLAG
        in 0xa807..0xa80a -> XID_EITHER_FLAG
        0xa80b -> XID_CONTINUE_FLAG
        in 0xa80c..0xa822 -> XID_EITHER_FLAG
        in 0xa823..0xa827 -> XID_CONTINUE_FLAG
        in 0xa840..0xa873 -> XID_EITHER_FLAG
        in 0xa880..0xa881 -> XID_CONTINUE_FLAG
        in 0xa882..0xa8b3 -> XID_EITHER_FLAG
        in 0xa8b4..0xa8c5,
        in 0xa8d0..0xa8d9,
        in 0xa8e0..0xa8f1 -> XID_CONTINUE_FLAG
        in 0xa8f2..0xa8f7,
        0xa8fb,
        0xa8fd -> XID_EITHER_FLAG
        in 0xa900..0xa909 -> XID_CONTINUE_FLAG
        in 0xa90a..0xa925 -> XID_EITHER_FLAG
        in 0xa926..0xa92d -> XID_CONTINUE_FLAG
        in 0xa930..0xa946 -> XID_EITHER_FLAG
        in 0xa947..0xa953 -> XID_CONTINUE_FLAG
        in 0xa960..0xa97c -> XID_EITHER_FLAG
        in 0xa980..0xa983 -> XID_CONTINUE_FLAG
        in 0xa984..0xa9b2 -> XID_EITHER_FLAG
        in 0xa9b3..0xa9c0 -> XID_CONTINUE_FLAG
        0xa9cf -> XID_EITHER_FLAG
        in 0xa9d0..0xa9d9 -> XID_CONTINUE_FLAG
        in 0xa9e0..0xa9e4 -> XID_EITHER_FLAG
        0xa9e5 -> XID_CONTINUE_FLAG
        in 0xa9e6..0xa9ef -> XID_EITHER_FLAG
        in 0xa9f0..0xa9f9 -> XID_CONTINUE_FLAG
        in 0xa9fa..0xa9fe,
        in 0xaa00..0xaa28 -> XID_EITHER_FLAG
        in 0xaa29..0xaa36 -> XID_CONTINUE_FLAG
        in 0xaa40..0xaa42 -> XID_EITHER_FLAG
        0xaa43 -> XID_CONTINUE_FLAG
        in 0xaa44..0xaa4b -> XID_EITHER_FLAG
        in 0xaa4c..0xaa4d,
        in 0xaa50..0xaa59 -> XID_CONTINUE_FLAG
        in 0xaa60..0xaa76,
        0xaa7a -> XID_EITHER_FLAG
        in 0xaa7b..0xaa7d -> XID_CONTINUE_FLAG
        in 0xaa7e..0xaaaf -> XID_EITHER_FLAG
        0xaab0 -> XID_CONTINUE_FLAG
        0xaab1 -> XID_EITHER_FLAG
        in 0xaab2..0xaab4 -> XID_CONTINUE_FLAG
        in 0xaab5..0xaab6 -> XID_EITHER_FLAG
        in 0xaab7..0xaab8 -> XID_CONTINUE_FLAG
        in 0xaab9..0xaabd -> XID_EITHER_FLAG
        in 0xaabe..0xaabf -> XID_CONTINUE_FLAG
        0xaac0 -> XID_EITHER_FLAG
        0xaac1 -> XID_CONTINUE_FLAG
        0xaac2,
        in 0xaadb..0xaadd,
        in 0xaae0..0xaaea -> XID_EITHER_FLAG
        in 0xaaeb..0xaaef -> XID_CONTINUE_FLAG
        in 0xaaf2..0xaaf4 -> XID_EITHER_FLAG
        in 0xaaf5..0xaaf6 -> XID_CONTINUE_FLAG
        in 0xab01..0xab06,
        in 0xab09..0xab0e,
        in 0xab11..0xab16,
        in 0xab20..0xab26,
        in 0xab28..0xab2e,
        in 0xab30..0xab5a,
        in 0xab5c..0xab65,
        in 0xab70..0xabe2 -> XID_EITHER_FLAG
        in 0xabe3..0xabea,
        in 0xabec..0xabed,
        in 0xabf0..0xabf9 -> XID_CONTINUE_FLAG
        in 0xac00..0xd7a3,
        in 0xd7b0..0xd7c6,
        in 0xd7cb..0xd7fb,
        in 0xf900..0xfa6d,
        in 0xfa70..0xfad9,
        in 0xfb00..0xfb06,
        in 0xfb13..0xfb17,
        0xfb1d -> XID_EITHER_FLAG
        0xfb1e -> XID_CONTINUE_FLAG
        in 0xfb1f..0xfb28,
        in 0xfb2a..0xfb36,
        in 0xfb38..0xfb3c,
        0xfb3e,
        in 0xfb40..0xfb41,
        in 0xfb43..0xfb44,
        in 0xfb46..0xfbb1,
        in 0xfbd3..0xfc5d,
        in 0xfc64..0xfd3d,
        in 0xfd50..0xfd8f,
        in 0xfd92..0xfdc7,
        in 0xfdf0..0xfdf9 -> XID_EITHER_FLAG
        in 0xfe00..0xfe0f,
        in 0xfe20..0xfe2f,
        in 0xfe33..0xfe34,
        in 0xfe4d..0xfe4f -> XID_CONTINUE_FLAG
        0xfe71,
        0xfe73,
        0xfe77,
        0xfe79,
        0xfe7b,
        0xfe7d,
        in 0xfe7f..0xfefc -> XID_EITHER_FLAG
        in 0xff10..0xff19 -> XID_CONTINUE_FLAG
        in 0xff21..0xff3a -> XID_EITHER_FLAG
        0xff3f -> XID_CONTINUE_FLAG
        in 0xff41..0xff5a,
        in 0xff66..0xff9d -> XID_EITHER_FLAG
        in 0xff9e..0xff9f -> XID_CONTINUE_FLAG
        in 0xffa0..0xffbe,
        in 0xffc2..0xffc7,
        in 0xffca..0xffcf,
        in 0xffd2..0xffd7,
        in 0xffda..0xffdc -> XID_EITHER_FLAG
        else -> 0
    }

/**
 * Returns true if the Unicode codepoint has the XID_Start property, meaning it can be used as the
 * first character of a programming language identifier.
 * http://unicode.org/reports/tr31/#Default_Identifier_Syntax
 *
 * XID_Start is a Unicode Derived Core Property. It is a variation of the ID_Start
 * Derived Core Property, accounting for a few characters that, when normalized, yield valid
 * characters in the ID_Start set.
 */
fun isXidStart(utf32: Int): Boolean = (findCharacterProperties(utf32) and XID_START_FLAG) != 0

/**
 * Returns true if the Unicode codepoint has the XID_Continue property, meaning it can be used in
 * any position of a programming language identifier, except the first.
 * http://unicode.org/reports/tr31/#Default_Identifier_Syntax
 *
 * XID_Continue is a Unicode Derived Core Property. It is a variation of the ID_Continue
 * Derived Core Property, accounting for a few characters that, when normalized, yield valid
 * characters in the ID_Continue set.
 */
fun isXidContinue(utf32: Int): Boolean = (findCharacterProperties(utf32) and XID_CONTINUE_FLAG) != 0


private val JAVA_REVERSED_KEYWORDS = arrayListOf<String>(
    "abstract",
    "assert",
    "boolean",
    "break",
    "byte",
    "case",
    "catch",
    "char",
    "class",
    "const",
    "default",
    "do",
    "double",
    "else",
    "enum",
    "extends",
    "false",
    "final",
    "finally",
    "float",
    "for",
    "goto",
    "if",
    "implements",
    "import",
    "instanceof",
    "int",
    "interface",
    "long",
    "native",
    "new",
    "null",
    "package",
    "private",
    "protected",
    "public",
    "return",
    "short",
    "static",
    "strictfp",
    "super",
    "switch",
    "synchronized",
    "this",
    "throw",
    "throws",
    "transient",
    "true",
    "try",
    "void",
    "volatile",
    "while",
    "continue",
)

fun isJavaReversedKeywords(string: String): Boolean{
    return JAVA_REVERSED_KEYWORDS.contains(string)
}

/**
 * Returns true if the UTF8 string can be used as a Java identifier.
 * NOTE: This does not check against the set of reserved Java keywords.
 */
fun isJavaIdentifier(string: String): Boolean {
    if (string.isEmpty()) {
        return false
    }
    val firstCodePoint = string.codePointAt(0)
    if (!isXidStart(firstCodePoint) &&
        firstCodePoint != '_'.toInt() &&
        firstCodePoint != '$'.toInt()
    ) {
        return false
    }
    for (i in 1.until(string.codePointCount(0, string.length))) {
        val codePoint = string.codePointAt(i)
        if (!isXidContinue(codePoint) && codePoint != '$'.toInt()) {
            return false
        }
    }
    return true
}

/**
 * Returns true if the UTF8 string can be used as the entry name of a resource name.
 * This is the `entry` part of package:type/entry.
 */
fun isValidResourceEntryName(string: String): Boolean {
    if (string.isEmpty()) {
        return false
    }
    // Resources can start with '_'.
    val firstCodePoint = string.codePointAt(0)
    if (!isXidStart(firstCodePoint) && firstCodePoint != '_'.toInt()) {
        return false
    }
    for (i in 1.until(string.codePointCount(0, string.length))) {
        val codePoint = string.codePointAt(i)
        if (!isXidContinue(codePoint) && codePoint != '.'.toInt() && codePoint != '-'.toInt()) {
            return false
        }
    }
    return true
}