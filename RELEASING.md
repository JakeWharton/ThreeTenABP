Releasing
========

 1. Change the version in `gradle.properties` to a non-SNAPSHOT verson.
 2. Update the `CHANGELOG.md` for the impending release.
 3. Update the `README.md` with the new version.
 4. `./gradlew downloadTZDB` to grab the latest TZDB and `git add .` to add it
 5. `git commit -am "Prepare for release X.Y.Z."` (where X.Y.Z is the new version)
 6. `git tag -a X.Y.X -m "Version X.Y.Z"` (where X.Y.Z is the new version)
 7. `./gradlew clean uploadArchives`
 8. Update the `gradle.properties` to the next SNAPSHOT version.
 9. `git commit -am "Prepare next development version."`
 10. `git push && git push --tags`
 11. Visit [Sonatype Nexus](https://oss.sonatype.org/) and promote the artifact.
