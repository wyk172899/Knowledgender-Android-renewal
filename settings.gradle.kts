pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "knowledgender"
include(":app")
include(":feature")
include(":feature:home")
include(":feature:cardnews-detail")
include(":core")
include(":core:datastore")
include(":core:designsystem")
include(":core:domain")
include(":core:testing")
include(":core:navigation")
