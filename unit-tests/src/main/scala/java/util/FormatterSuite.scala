package java.util
import java.math.BigDecimal

object FormatterSuite extends tests.Suite {
  def assertEquals(a: String, b: String) = {
    val r = a == b 
    println(s"$a =/= $b")
    assert(r)
  }

  test("test_formatLjava_lang_String$Ljava_lang_Object_BigDecimalConversionF") {
    val input = scala.List(
      (BigDecimal.ZERO,                                                "%f",          "0.000000"),
      (BigDecimal.ZERO,                                                "%#.3f",       "0.000"),
      (BigDecimal.ZERO,                                                "%#,5f",       "0.000000"),
      (BigDecimal.ZERO,                                                "%- #(12.0f",  " 0.         "),
      (BigDecimal.ZERO,                                                "%#+0(1.6f",   "+0.000000"),
      (BigDecimal.ZERO,                                                "%-+(8.4f",    "+0.0000 "),
      (BigDecimal.ZERO,                                                "% 0#(9.8f",   " 0.00000000"),
      (BigDecimal.ONE,                                                 "%f",          "1.000000"),
      (BigDecimal.ONE,                                                 "%#.3f",       "1.000"),
      (BigDecimal.ONE,                                                 "%#,5f",       "1.000000"),
      (BigDecimal.ONE,                                                 "%- #(12.0f",  " 1.         "),
      (BigDecimal.ONE,                                                 "%#+0(1.6f",   "+1.000000"),
      (BigDecimal.ONE,                                                 "%-+(8.4f",    "+1.0000 "),
      (BigDecimal.ONE,                                                 "% 0#(9.8f",   " 1.00000000"),
      (BigDecimal.TEN,                                                 "%f",          "10.000000"),
      (BigDecimal.TEN,                                                 "%#.3f",       "10.000"),
      (BigDecimal.TEN,                                                 "%#,5f",       "10.000000"),
      (BigDecimal.TEN,                                                 "%- #(12.0f",  " 10.        "),
      (BigDecimal.TEN,                                                 "%#+0(1.6f",   "+10.000000"),
      (BigDecimal.TEN,                                                 "%-+(8.4f",    "+10.0000"),
      (BigDecimal.TEN,                                                 "% 0#(9.8f",   " 10.00000000"),
      (new BigDecimal(-1),                                             "%f",          "-1.000000"),
      (new BigDecimal(-1),                                             "%#.3f",       "-1.000"),
      (new BigDecimal(-1),                                             "%#,5f",       "-1.000000"),
      (new BigDecimal(-1),                                             "%- #(12.0f",  "(1.)        "),
      (new BigDecimal(-1),                                             "%#+0(1.6f",   "(1.000000)"),
      (new BigDecimal(-1),                                             "%-+(8.4f",    "(1.0000)"),
      (new BigDecimal(-1),                                             "% 0#(9.8f",   "(1.00000000)"),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "%f",          "9999999999999999999999999999999999999999999.000000"),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "%#.3f",       "9999999999999999999999999999999999999999999.000"),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "%#,5f",       "9,999,999,999,999,999,999,999,999,999,999,999,999,999,999.000000"),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "%- #(12.0f",  " 9999999999999999999999999999999999999999999."),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "%#+0(1.6f",   "+9999999999999999999999999999999999999999999.000000"),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "%-+(8.4f",    "+9999999999999999999999999999999999999999999.0000"),
      (new BigDecimal("9999999999999999999999999999999999999999999"),  "% 0#(9.8f",   " 9999999999999999999999999999999999999999999.00000000"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "%f",          "-9999999999999999999999999999999999999999999.000000"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "%#.3f",       "-9999999999999999999999999999999999999999999.000"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "%#,5f",       "-9,999,999,999,999,999,999,999,999,999,999,999,999,999,999.000000"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "%- #(12.0f",  "(9999999999999999999999999999999999999999999.)"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "%#+0(1.6f",   "(9999999999999999999999999999999999999999999.000000)"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "%-+(8.4f",    "(9999999999999999999999999999999999999999999.0000)"),
      (new BigDecimal("-9999999999999999999999999999999999999999999"), "% 0#(9.8f",   "(9999999999999999999999999999999999999999999.00000000)")
    )

    input.foreach{ case (input, pattern, expectedOutput) =>
      val f = new Formatter(Locale.US);
      assertEquals(f.format(pattern, input).toString(), expectedOutput)
    }

    //     }; 
    //     for (int i = 0; i < tripleF.length; i++) {
    //         f = new Formatter(Locale.US);
    //         f.format((String)tripleF[i][pattern], tripleF[i][input]);
    //         assertEquals("triple[" + i + "]:" + tripleF[i][input] + ",pattern["
    //                 + i + "]:" + tripleF[i][pattern], tripleF[i][output], f.toString());
    //     }

    //     f = new Formatter(Locale.US);
    //     f.format("%f", new BigDecimal("5.0E9"));
    //     // error on RI
    //     // RI throw ArrayIndexOutOfBoundsException
    //     assertEquals("5000000000.000000", f.toString());

    // assert(true)
  }
}