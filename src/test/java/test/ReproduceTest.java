package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ReproduceTest {

  @Test
  public void test() {
    assertThat("a").isNotNull();
  }

}
