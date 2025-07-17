# Example O-Equine Accessory Addon
This addon can be used as a template to add your own custom saddles, armor, and/ or carpets.

This is for LO-2.8+, Forge 1.20.1.

### Licensing & Copyrights
The addon you create from this must be free-to-play if you decide to distribute it. 
You may not charge others for this addon to be used in any capacity. You can post this addon
to things like Curseforge or Modrinth, or for free on your KoFi instead/ too if you
want, provided it still requires LO to run. (It does by default.)

The addon you create from this will go under Livestock Overhaul's original copyrights, found here: 
https://github.com/DragN0007/Overhauled-Livestock-1.20.1

If you use any of my original assets from Livestock Overhaul (LO) to create any assets, in general 
(not just for this specific template), they will go under my (DragN0007) copyrights. You do have
permission to use these as long as they're used for an LO-specific addon that requires LO to run.

When you create an addon from this template, you agree to these terms.

### Starting Out

This template will be much easier for those who already have and know how to code with IntelliJ. 
I've done all the hard work for you; all you have to do is set up your environment and copy what I've done.
I've also listed some free resources to get started.
Do keep in mind that I'm not really here to teach you how to code if you've never done it before; this
template is more novice-and-above friendly rather than fresh-beginner-friendly.

**To complete this addon, you'll need:**

-Blockbench (or some other art program that can create pixel art).
https://www.blockbench.net

-IntelliJ IDEA (Community Edition, since it's free. Ultimate is not, so make sure to get the right one). 
https://www.jetbrains.com/idea/download/other.html

-To fork or clone this repository onto your computer from GitHub, 
or just make a new project if you wish and follow the code found here if you know how.

-The O-Horse model and (likely) textures. You can find those in the same repo as the licensing link. These
assets are only to be used for LO-addon or LO-resourcepack use.

If you've never set up IntelliJ before, please reference this awesome video from KaupenJoe:
https://youtu.be/55qUIf3GMss?si=5WSivGBMWgztzE9F

**Extra:**

_(You may only need this in special circumstances)_

`Forge 1.20.1 Documentation:` https://docs.minecraftforge.net/en/1.20.1/

### Adding Your Custom Accessories

Once you've set everything up (congrats, you've made your very own Dev Environment!) 
you can go ahead and start adding your own accessories. There one of each
available to override in this addon by default. If you don't need the extra ones, just delete the code for them.

You will likely make mistakes if you're new to this. Don't worry, just go through the Common Issues section and try again.

I've attempted to keep this addon relatively small whilst also keeping it informative. There are comments
scattered about for you to read if you need them. I also often refer to blankets as "carpets", but I just
simply mean blankets. Make sure to follow what I've done, especially with item naming and file pathing.

Personally, if I were starting out, I'd create my item sprites first and add those in, and then continue
on with the actual "on the horse" textures.

### Compiling
When you're done with your addon, you need to compile it. You can do this by going to your Terminal and 
typing `./gradlew build`. This will build your .jar file and place it in build/libs. You can then copy paste
this file onto your computer somewhere and use it as a mod just like that!

### Pathways
**Armor:**
`assets/dragnlivestock/textures/entity/horse/armor/place_your_texture_here.png`

**Armor Carpet:**
`assets/dragnlivestock/textures/entity/horse/armor/carpet/special/place_your_texture_here.png`

**Carpets:**
`assets/dragnlivestock/textures/entity/horse/carpet/special/place_your_texture_here.png`

**Saddles & Tack:**
`assets/dragnlivestock/textures/entity/horse/tack/place_your_texture_here.png`

### Common Issues
**You get an error telling you your versioning isn't correct**

`Go to File > Project Structure > Project > Change your SDK in the dropdown to corretto-22. Build your gradle.`

_If you don't have that option, go to Add SDK > Download SDK > Download Amazon Corretto 22 and use it_

**You can't run the game**

`Build your gradle and then go to your Gradle tab > forgegradle runs > runClient to open the game for the first time`

**You can't run DataGen**

`Build your gradle and then go to your Gradle tab > forgegradle runs > runData to run datagen for the first time`

**Your DataGen isn't doing anything**

`Go to your gradle.properties and make sure your modid is correct in the mod_id and mod_goup_id areas. 
Build your gradle and try again.`

**You get an invocation error when generating item data**

`Your item textures either don't exist, aren't in the right folder path, 
or aren't spelled the same way as the registry name in the code.`

**The textures on equines in-game are coming up as missingno**

`Make sure your textures and items are spelled correctly and are the same exact names. Follow what I did
in the template; names do matter!`

**You registered your saddles and/ or blankets in the right tags, but they still won't go in the slots**\

`Make sure your item names and modid in the tag jsons are correct and are correctly spelled.`

**You can't craft your custom blankets, despite seeing the recipes correctly in 'generated [main]'**

`Make sure the "Allow Special Event Blanket Crafting" config is set to true.`

### Questions

**Q:** Why do I have to put my textures in those specific paths for them to work?

**A:** Because I SAID SO!!! (LO is coded to specifically take that path to prevent mixups and clashing
between it and addons)


**Q:** Can I add more than just one of each accessory?

**A:** Yes, just copy paste previous blocks of code and change them to whatever you want to add.


**Q:** Can you get on call with me and teach-

**A:** * falls over and dies instantly, disintegrating into dust on impact *


**Q:** Can I use MCreator instead? 

**A:** I have no idea. I wouldn't recommend it though.


**Q:** Can I add other things instead of accessories using this addon template?

**A:** If you know how, then go right ahead!