package com.tonytangandroid.motif.assist.mylibrary;

import com.google.common.truth.Truth;
import org.junit.Test;

public class UnitTestCodeTest {

  @Test public void message() {
    Truth.assertThat(UnitTestCode.message()).isEqualTo("code tested by unit test");
  }
}