/*
 * Copyright (C) 2021 The Android Open Source Project
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
package com.android.car.libraries.templates.host.view.animation;

import android.view.animation.Animation;

/**
 * Provides empty implementations of the methods in {@link Animation.AnimationListener} for
 * convenience reasons.
 */
public class AnimationListenerAdapter implements Animation.AnimationListener {
  @Override
  public void onAnimationStart(Animation animation) {}

  @Override
  public void onAnimationEnd(Animation animation) {}

  @Override
  public void onAnimationRepeat(Animation animation) {}
}
