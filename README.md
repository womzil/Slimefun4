# Slimefun 4

Looking for the Original Chinese Version? [**Click here**](https://github.com/SlimefunGuguProject/Slimefun4/)

Want to download directly? [**Click here**](https://github.com/SaanPrasanna/Slimefun4/releases)

This is an English translation fork maintained by @SaanPrasanna

Download [SlimeGlue](https://github.com/Xzavier0722/SlimeGlue/) to ensure compatibility between Slimefun and other protection plugins

### About This Fork

This is an English translation of the Slimefun 4 Chinese fork, maintained by @SaanPrasanna.

For the original Chinese version and subscription plans, visit: [GuguProject Builds](https://builds.guizhanss.com/sf-subscription)

![Current Version](https://img.shields.io/github/v/release/SaanPrasanna/Slimefun4?include_prereleases)
![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
[![Issues](https://img.shields.io/github/issues/SaanPrasanna/Slimefun4.svg?style=popout)](https://github.com/SaanPrasanna/Slimefun4/issues)
![Downloads](https://img.shields.io/github/downloads/SaanPrasanna/Slimefun4/total)

**Note:** This is an English translation fork. Please report issues specific to this fork here. For original Slimefun issues, use the [official issue tracker](https://github.com/Slimefun/Slimefun4/issues).

Slimefun is a plugin that aims to provide a modding-like experience. It offers everything you can imagine, from jetpacks to magic altars!

Slimefun allows every player to decide whether to develop in magic or technology.
From wands to nuclear reactors, we have it all.
In addition, we also have magic altars, energy networks, and even item transportation systems.

This project started in 2013 and is still evolving today.
It has grown from a small independent plugin to a community with thousands of participants and hundreds of contributors.
Currently, Slimefun has added more than **500 new items/crafting recipes**
([Learn about the history of Slimefun](https://github.com/Slimefun/Slimefun4/wiki/Slimefun-in-a-nutshell)).

At the same time, Slimefun also has a wide variety of addon plugins to choose from!<br>
Check out the [Addon List](https://github.com/Slimefun/Slimefun4/wiki/Addons) to find the addons you want!

### Navigation

* **[Download Slimefun 4](#floppy_disk-downloading-slimefun-4)**
* **[Discord Server](#discord)**
* **[Bug Reports](https://github.com/SaanPrasanna/Slimefun4/issues)**
* **[Official Wiki](https://github.com/Slimefun/Slimefun4/wiki)**
* **[FAQ](https://github.com/Slimefun/Slimefun4/wiki/FAQ)**

## :floppy_disk: Downloading Slimefun 4

(See also: [How to install Slimefun](https://github.com/Slimefun/Slimefun4/wiki/Installing-Slimefun))

This English fork of Slimefun 4 can be downloaded from the [Releases page](https://github.com/SaanPrasanna/Slimefun4/releases).

For the original Chinese version with auto-updates, visit [GuizhanBuild](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4).

Here are the differences between the two types of versions:

|                      | Development Builds (Latest Updates)                                                       | "Stable" Builds                                                                            |
|----------------------|-------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| **Minecraft Version** | :video_game: 1.19.X - 1.21.X                                                              | :video_game: 1.16.X - 1.21.4                                                               |
| **Java Version**      | :computer: **Java 17+**                                                                   | :computer: **Java 17+**                                                                    |
| **Auto-Updates**      | :heavy_check_mark:                                                                        | :heavy_check_mark:                                                                         |
| **Frequent Updates**  | :heavy_check_mark:                                                                        | :x:                                                                                        |
| **Latest Content**    | :heavy_check_mark:                                                                        | :x:                                                                                        |
| **Bug Reports**       | :heavy_check_mark:                                                                        | :x:                                                                                        |
| **Download Link**     | :package: **[Download Dev](https://github.com/SaanPrasanna/Slimefun4/releases/latest)** | :package: **[Download Stable](https://github.com/SaanPrasanna/Slimefun4/releases)** |


**Note: The supported Minecraft versions listed above do not represent the full range of available versions. They may refer to certain historical versions. The version markings are for reference only.**

**! It is recommended to use the latest development builds to get the latest content updates and bug fixes!**

## :computer: (Development) Adding as a Dependency

<details>

<summary>How to add Slimefun 4 as a dependency</summary>

First add our repository:

Maven:

Release version:
```xml
<repository>
    <id>gugu-maven-repo</id>
    <url>https://maven.norain.city/releases</url>
</repository>
```

Development version (Slimefun Insider / DEV branch):
```xml
<repository>
    <id>gugu-maven-repo</id>
    <url>https://maven.norain.city/snapshots</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

Gradle: Add the following to your `build.gradle`:

Release version:
```groovy
repositories {
    maven {
        url "https://maven.norain.city/releases"
    }
}
```

Development version (Slimefun Insider / DEV branch):
```groovy
repositories {
    maven {
        url "https://maven.norain.city/snapshots"
    }
}
```

Then add Slimefun 4 as a dependency:

Maven:

```xml
<dependency>
    <groupId>com.github.SlimefunGuguProject</groupId>
    <artifactId>Slimefun4</artifactId>
    <version>DEV-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

Gradle:

```groovy
dependencies {
    compileOnly 'com.github.SlimefunGuguProject:Slimefun4:DEV-SNAPSHOT'
}
```
</details>


## :computer: Compiling Slimefun

To compile Slimefun4, you must first install [Git](https://git-scm.com/)

Open a terminal or command prompt in the location where you want to store the code and run the following command:

```bash
git clone https://github.com/SaanPrasanna/Slimefun4.git --depth=1
```
This will pull Slimefun's code to your local machine.

Finally, open the `Slimefun4` folder, and open a terminal or command prompt in that folder and enter the following command to compile:
- If you are on Windows: `.\mvnw.cmd package`
- If you are on a Unix-like system: `.\mvnw package`

After compilation is complete, you can find the compiled plugin file in the `Slimefun4/target` folder.

## :framed_picture: Screenshots

So, what does Slimefun look like?<br>
We asked some people from our [Discord server](#discord) to send us some screenshots:

| Reactors and Energy | Amazing Automation Factory | Magic Laboratory |
| :-------------------------------------------: | :--------------------------------------: | :----------------------------------------: |
| ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase1.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase6.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase5.png) |
| *Screenshot by HamtaBot#0001* | *Screenshot by Piͭxͪeͤl (mnb)#5049* | *Screenshot by Kilaruna#4981* |
| ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase4.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase3.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase2.png) |
| *Screenshot by GalaxyKat11#3816* | *Screenshot by TamThan#7987* | *Screenshot by Kilaruna#4981* |

## :headphones: Community

### Community Channels

**English Fork Maintainer:** @SaanPrasanna

For Chinese community:
- QQ Group: 807302496 (Slimefun Chinese Version)
- Addon Discussion QQ Group: 205679802 (Slimefun Addon Discussion and translation group plugin update notifications)

### KOOK Channel

Welcome to join the KOOK [Slimefun Simplified Chinese Community](https://kook.top/oqZwh8) server

### Official Discord

You can find Slimefun's community server on Discord and communicate with **over 7000** users from around the world.
Click the image below to join the Discord server to report issues, make suggestions, or discuss the plugin.
The official Slimefun community often holds community events, join to learn more.
**Note**: The official Slimefun Discord server does **not** accept any form of issue reports. Please use the [issue tracker](https://github.com/Slimefun/Slimefun4/issues) to report issues!

Please familiarize yourself with the [important rules](https://github.com/Slimefun/Slimefun4/wiki/Discord-Rules) of the official Discord server before joining.
People who do not follow the above rules may be kicked or even banned from the server.

<p align="center">
  <a href="https://discord.gg/slimefun">
    <img src="https://discordapp.com/api/guilds/565557184348422174/widget.png?style=banner3" alt="Discord Invite"/>
  </a>
</p>

## :open_book: Wiki

Slimefun has a (detailed and frequently maintained - *ahem*) Wiki for new players,
and you can also consider contributing to the Wiki.

Official Wiki: https://github.com/Slimefun/Slimefun4/wiki
Unofficial Chinese Wiki: https://slimefun-wiki.guizhanss.cn/

#### :star: Useful Documentation

* [What is Slimefun?](https://github.com/Slimefun/Slimefun4/wiki/Slimefun-in-a-nutshell)
* [How to install Slimefun](https://github.com/Slimefun/Slimefun4/wiki/Installing-Slimefun)
* [Slimefun 4 Addon List](https://github.com/Slimefun/Slimefun4/wiki/Addons)
* [Slimefun 4 Addon Development Guide](https://github.com/Slimefun/Slimefun4/wiki/Developer-Guide)
* [Getting Started](https://github.com/Slimefun/Slimefun4/wiki/Getting-Started)
* [FAQ](https://github.com/Slimefun/Slimefun4/wiki/FAQ)
* [Common Issues](https://github.com/Slimefun/Slimefun4/wiki/Common-Issues)
* [Help us expand the Wiki!](https://github.com/Slimefun/Slimefun4/wiki/Expanding-the-Wiki)
* [Help us translate Slimefun!](https://github.com/Slimefun/Slimefun4/wiki/Translating-Slimefun)

The Chinese Wiki is maintained by @ybw0014. If you find missing articles, please report them on the Wiki's Issues page.

## :handshake: Contributing to the Project

Slimefun 4 is an open-source project licensed under the [GNU GPLv3](https://github.com/Slimefun/Slimefun4/blob/master/LICENSE).
Over 100 people have contributed to this project, and they are amazing.
We encourage you to contribute to Slimefun 4 by submitting PRs. Your contributions keep us alive <3.

## :exclamation: Disclaimer

Slimefun4 uses multiple systems to collect plugin usage data and has auto-update functionality to push new versions to you.
The plugin does not collect personal information stored in any form. The types of information collected can be seen below.

Of course, you can disable data telemetry and auto-updates at any time.

<details>
  <summary>Auto-Updates</summary>

The English fork of Slimefun uses GitHub API to check for and download updates.
Auto-updates are enabled by default, but you can choose to disable them in `/plugins/Slimefun/config.yml`.
We strongly recommend keeping auto-updates enabled to ensure you get the latest features/fixes.

The original Chinese version uses Github API + GuizhanBuild API for updates.

---

Slimefun also uses its own analytics system to collect anonymous information about the performance of this plugin.<br>
This is solely for statistical purposes, as we are interested in how it's performing for all servers.<br>
All available data is anonymous and aggregated, at no point can we see individual server information.<br>

You can also disable this behaviour under `/plugins/Slimefun/config.yml`.<br>

</details>

<details>
  <summary>Anonymous Server Data</summary>

Slimefun4 uses [bStats](https://bstats.org/plugin/bukkit/Slimefun/4574) to collect anonymous information about the plugin because we are interested in how server players use the plugin.
However, all data published on bStats is anonymous, and we absolutely cannot trace back to specific servers or players based on the reported data.
All collected data is publicly accessible: https://bstats.org/plugin/bukkit/Slimefun/4574

You can also disable data collection in `/plugins/bStats/config.yml`.
Learn more by checking out [bStats Privacy Policy](https://bstats.org/privacy-policy).

</details>

<details>
  <summary>GitHub Data</summary>

Slimefun4 uses the [GitHub API](https://api.github.com/) to collect usage data about this open-source project.
Rest assured, your Minecraft server information will not be sent to GitHub.

This information includes but is not limited to:

* List of collaborators, their usernames and profile links (from repositories `Slimefun/Slimefun4`, `Slimefun/Slimefun-Wiki`, and `Slimefun/Resourcepack`)
* Number of open issues in the repository
* Number of pending pull requests in the repository
* Number of stars in the repository
* Number of forks of the repository
* Code size of the repository
* Date of the last commit in the repository

</details>

Additionally, the plugin also uses [textures.minecraft.net](https://www.minecraft.net/en-us) to obtain collaborators' Minecraft skins.
Please note: Slimefun is not affiliated with `Mojang Studios` or Minecraft.

---

## Credits

**English Translation Fork maintained by:** @SaanPrasanna

**Original Chinese Translation:** SlimefunGuguProject
**Original Slimefun:** TheBusyBiscuit and contributors

This is a fork focused on providing an English translation of the Chinese Slimefun fork while preserving all the features and functionality.
