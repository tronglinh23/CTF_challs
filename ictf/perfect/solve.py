from PIL import Image, ImageDraw
import os
img = Image.new('RGBA', (690,420),(255,255,255,255))
draw = ImageDraw.Draw(img)

pixels = {
  (412, 309):(52, 146, 235, 123),
  (12, 209):(42, 16, 125, 231),
  (264, 143):(122, 136, 25, 213)
}

for (x,y), color in pixels.items():
  draw.point((x,y), color)


img.save('img.png')

img.close()


Description = "jctf{not_the_flag}"
Title = "kool_pic"
Author = "anon"

os.system(f"exiftool -Description=\"{Description}\" -Title=\"{Title}\" -Author=\"{Author}\" img.png")