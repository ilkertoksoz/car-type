package config;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@ExtendWith(MockitoExtension.class)
public class UnitTestExistenceControllerTest {

	private List<String> serviceMethodList = new ArrayList<>();

	// Method names could be defined as testAAA_BBB, testAAA_CCC. So following field
	// types were declared as
	// Set for preventing duplication.
	private Set<String> serviceTestMethodSet = new HashSet<>();

	private List<String> listOfServiceMethodsThatHaveUnitTests = new ArrayList<>();
	private List<String> listOfServiceMethodsThatDontHaveUnitTests = new ArrayList<>();

	public static Collection<File> getFileList(File dir) {

		Set<File> fileTree = new HashSet<>();

		if (dir != null && dir.listFiles() != null && dir.listFiles().length > 0) {

			for (File entry : dir.listFiles()) {

				if (entry.isFile())
					fileTree.add(entry);

				else
					fileTree.addAll(getFileList(entry));
			}

		}
		return fileTree;
	}

	@Test
	public void controlExistenceOfUnitTest() throws Exception {
		
	/*	try {
			System.out.println("Unit test existence controller has just started to scan the codebase..");
			
			String thisClass = UnitTestExistenceControllerTest.class.getResource(UnitTestExistenceControllerTest.class.getSigners());
			File rootPath=new File(thisClass.substring(0, ))
		} */
	}

}
