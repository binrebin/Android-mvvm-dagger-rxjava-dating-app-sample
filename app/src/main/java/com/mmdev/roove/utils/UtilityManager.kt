/*
 * Created by Andrii Kovalchuk
 * Copyright (c) 2019. All rights reserved.
 * Last modified 09.12.19 20:46
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.mmdev.roove.utils

import com.mmdev.business.user.entity.UserItem
import java.util.*
import kotlin.collections.ArrayList

object UtilityManager {

	fun generateUsers(): List<UserItem> {
		val gender1 = "male"
		val gender2 = "female"
		val users: ArrayList<UserItem> = ArrayList()
		val photoURLs = ArrayList<String>()
		photoURLs.add("https://pp.userapi.com/c638424/v638424593/15ad9/SiQb3lYQQrQ.jpg")
		users.add(UserItem("Daria Roman",
		                   "Kyiv",
		                   "female",
		                   "male",
		                   "https://pp.userapi.com/c638424/v638424593/15ad9/SiQb3lYQQrQ.jpg",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/NYyCqdBOKwc/600x800")
		users.add(UserItem("Shana Gross",
		                   "Kyoto",
		                   gender1,
		                   gender2,
		                   "https://source.unsplash.com/NYyCqdBOKwc/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/buF62ewDLcQ/600x800")
		users.add(UserItem("Borys Bowes",
		                   "Kyoto",
		                   gender1,
		                   gender2,
		                   "https://source.unsplash.com/buF62ewDLcQ/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/THozNzxEP3g/600x800")
		users.add(UserItem("Judith Foreman",
		                   "New York",
		                   gender1,
		                   gender2,
		                   "https://source.unsplash.com/THozNzxEP3g/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/USrZRcRS2Lw/600x800")
		users.add(UserItem("Jamie Tyson",
		                   "New York",
		                   "female",
		                   "male",
		                   "https://source.unsplash.com/USrZRcRS2Lw/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/PeFk7fzxTdk/600x800")
		users.add(UserItem("Sanah Clements",
		                   "New York",
		                   "female",
		                   "male",
		                   "https://source.unsplash.com/PeFk7fzxTdk/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/LrMWHKqilUw/600x800")
		users.add(UserItem("Mikaeel Sykes",
		                   "Paris",
		                   "female",
		                   "male",
		                   "https://source.unsplash.com/LrMWHKqilUw/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/HN-5Z6AmxrM/600x800")
		users.add(UserItem("Madihah Read",
		                   "Paris",
		                   "female",
		                   "male",
		                   "https://source.unsplash.com/HN-5Z6AmxrM/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/CdVAUADdqEc/600x800")
		users.add(UserItem("Leila Sutton",
		                   "London",
		                   "female",
		                   "male",
		                   "https://source.unsplash.com/CdVAUADdqEc/600x800",
		                   photoURLs,
		                   generateRandomID()))
		photoURLs.clear()
		photoURLs.add("https://source.unsplash.com/AWh9C-QjhE4/600x800")
		users.add(UserItem("Simran Quintana",
		                   "China",
		                   "female",
		                   "male",
		                   "https://source.unsplash.com/AWh9C-QjhE4/600x800",
		                   photoURLs,
		                   generateRandomID()))
		return users
	}

	/*
    generate random uid
     */
	private fun generateRandomID(): String {
		val leftLimit = 97 // letter 'a'

		val rightLimit = 122 // letter 'z'

		val targetStringLength = 10
		val random = Random()
		val buffer = StringBuilder(targetStringLength)
		for (i in 0 until targetStringLength) {
			val randomLimitedInt =
				leftLimit + (random.nextFloat() * (rightLimit - leftLimit + 1)).toInt()
			buffer.append(randomLimitedInt.toChar())
		}
		return buffer.toString()
	}
}