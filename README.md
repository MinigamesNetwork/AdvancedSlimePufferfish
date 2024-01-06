# A fork of Advanced Slime Paper (ASWM)

* This fork of ASP fixes some bugs and allows async world creation that removes some part of the lag caused by the world creation process.

Advanced Slime Paper is a fork of Paper implementing the Slime Region Format developed by Hypixel. Originally a plugin, this project has been converted to a
fork to maximize our ability to provide fixes and performance improvements.
Its goal is to provide server administrators with an easy-to-use tool to load worlds faster and save space.

## Using SWM in your plugin

### Maven
```xml
<!-- InfernalSuite RELEASE -->
<repositories>
  <repository>
    <id>is-releases</id>
    <url>https://repo.infernalsuite.com/repository/maven-releases/</url>
  </repository>
</repositories>

<!-- InfernalSuite SNAPSHOT -->
<repositories>
  <repository>
    <id>is-snapshots</id>
    <url>https://repo.infernalsuite.com/repository/maven-snapshots/</url>
  </repository>
</repositories>
```

```xml
<dependencies>
  <dependency>
    <groupId>com.infernalsuite.aswm</groupId>
    <artifactId>api</artifactId>
    <version>INSERT LATEST VERSION HERE</version>
    <scope>provided</scope>
  </dependency>
</dependencies>
```

### Gradle
```groovy
repositories {
    maven { url = 'https://repo.infernalsuite.com/repository/maven-snapshots/' }
}

dependencies {
    compileOnly 'com.infernalsuite.aswm:api:INSERT LATEST VERSION HERE'
}
```

**If you run into any Flow-NBT errors when building your project, add the additional repository: `https://repo.rapture.pw/repository/maven-releases/`**

### Javadocs

The Javadocs can be found [here](https://grinderwolf.github.io/Slime-World-Manager/apidocs/).

## Wiki Overview
* Plugin Usage
   * [Installing ASWM](.docs/usage/install.md)
   * [Using ASWM](.docs/usage/using.md)
   * [Commands & Permissions](.docs/usage/commands-and-permissions.md)
* Configuration
   * [Setting up the Data Sources](.docs/config/setup-data-sources.md)
   * [Converting Traditional Worlds Into the SRF](.docs/config/convert-world-to-srf.md)
   * [Configuring Worlds](.docs/config/configure-world.md)
* SWM API
   * [Getting Started](.docs/api/setup-dev.md)
   * [World Properties](.docs/api/properties.md)
   * [Loading a World](.docs/api/load-world.md)
   * [Migrating a World](.docs/api/migrate-world.md)
   * [Importing a World](.docs/api/import-world.md)
   * [Using Custom Data Sources](.docs/api/use-data-source.md)
   * [Custom Build Preparation](.docs/api/custom-build-preparation.md)
   * [Setup RunServer for Plugin Development](.docs/api/setup-a-devserver.md)
* Other
   * [FAQ](.docs/other/faq.md)

## Credits

Thanks to:
* All the contributors that actively maintain ASWM and added features to SWM.
* [Paul19988](https://github.com/Paul19988) - ASWM Creator.
* [ComputerNerd100](https://github.com/ComputerNerd100) - Large Contributor & Maintainer.
* [b0ykoe](https://github.com/b0ykoe) - Provider of build services & repositories.
* [Owen1212055](https://github.com/Owen1212055) - Large Contributor & Maintainer.
* [Gerolmed](https://github.com/Gerolmed) - Contributor & Maintainer.
* [Grinderwolf](https://github.com/Grinderwolf) - The original creator.
* [Glare](https://glaremasters.me) - Providing the original Maven repository.
* [Minikloon](https://twitter.com/Minikloon) and all the [Hypixel](https://twitter.com/HypixelNetwork) team for developing the SRF.
