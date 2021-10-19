dependencies {
  implementation(Dependencies.kotlinStdLibJdk8)
  implementation(Dependencies.openTracing)

  testImplementation(Dependencies.assertj)
  testImplementation(Dependencies.junitApi)
  testImplementation(Dependencies.junitEngine)
  testImplementation(Dependencies.kotlinTest)
  testImplementation(Dependencies.openTracingMock)
}

apply(from = "$rootDir/gradle-mvn-publish.gradle")