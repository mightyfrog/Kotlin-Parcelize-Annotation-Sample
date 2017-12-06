package org.mightyfrog.android.kotlinparcelizeannotationsample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * @author Shigehiro Soejima
 */
@Parcelize
data class Item(var name: String, var age: Int) : Parcelable