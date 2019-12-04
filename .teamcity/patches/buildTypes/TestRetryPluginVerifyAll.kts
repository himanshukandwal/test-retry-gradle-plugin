package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'TestRetryPluginVerifyAll'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("TestRetryPluginVerifyAll")) {
    dependencies {
        remove(RelativeId("GradleTestRetryPlugin_LinuxJava18")) {
            snapshot {
                onDependencyFailure = FailureAction.CANCEL
                onDependencyCancel = FailureAction.CANCEL
            }
        }

        add(RelativeId("LinuxJava18")) {
            snapshot {
                onDependencyFailure = FailureAction.CANCEL
                onDependencyCancel = FailureAction.CANCEL
            }
        }

    }
}