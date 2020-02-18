import io.github.glytching.junit.extension.folder.TemporaryFolder;
import io.github.glytching.junit.extension.folder.TemporaryFolderExtension;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TemporaryFolderExtension.class)
@QuarkusTest
public class ReproducerQuarkusTest {

  @BeforeEach
  public void setUp(TemporaryFolder givenTemporaryFolder){

  }

  @Test
  public void test(TemporaryFolder givenTemporaryFolder){

  }
}
