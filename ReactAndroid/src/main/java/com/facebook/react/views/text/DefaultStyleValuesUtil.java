/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;

/**
 * Utility class that access default values from style
 */
public final class DefaultStyleValuesUtil {

  private DefaultStyleValuesUtil() {
    throw new AssertionError("Never invoke this for an Utility class!");
  }

  /**
   * Utility method that returns the default text hint color as define by the theme
   *
   * @param context The Context
   * @return The ColorStateList for the hint text as defined in the style
   */
  public static ColorStateList getDefaultTextColorHint(Context context) {
    Resources.Theme theme = context.getTheme();
    TypedArray textAppearances = null;
    try {
      textAppearances = theme.obtainStyledAttributes(new int[]{android.R.attr.textColorHint});
      ColorStateList textColorHint = textAppearances.getColorStateList(0);
      return textColorHint;
    } finally {
      if (textAppearances != null) {
        textAppearances.recycle();
      }
    }
  }

  /**
   * Utility method that returns the default text color as define by the theme
   *
   * @param context The Context
   * @return The ColorStateList for the text as defined in the style
   */
  public static ColorStateList getDefaultTextColor(Context context) {
    Resources.Theme theme = context.getTheme();
    TypedArray textAppearances = null;
    try {
      textAppearances = theme.obtainStyledAttributes(new int[]{android.R.attr.textColor});
      ColorStateList textColor = textAppearances.getColorStateList(0);
      return textColor;
    } finally {
      if (textAppearances != null) {
        textAppearances.recycle();
      }
    }
  }
}
