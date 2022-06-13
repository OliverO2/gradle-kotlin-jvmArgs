gradle.taskGraph.beforeTask {
    if (this is JavaExec) {
        jvmArgs = listOf("-javaagent:${gradle.rootProject.rootDir}/opentelemetry-javaagent-1.12.1.jar")
    }
}
