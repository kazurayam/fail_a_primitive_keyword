import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
	WebUI.callTestCase(findTestCase('sub - CONTINUE_ON_FAILURE'), ["message":">>> Intentional failure. Caller can continue"])
	WebUI.comment(">>> callTestCase() failed but Caller continued as FailureHandling.CONTINUE_ON_FAILURE specified")
} catch (Exception ex) {
	WebUI.comment(">>> caught an Exception: " + ex.getMessage())
}