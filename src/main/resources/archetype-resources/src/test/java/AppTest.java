#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppTest {
	@Test
	public void appTest() throws Exception {
		assertThat(true, is(true));
	}
}
