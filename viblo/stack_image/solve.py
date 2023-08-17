from PIL import Image, ImageChops
im1 = Image.open('key.png')
im2 = Image.open('something.png')

im3 = ImageChops.add(ImageChops.subtract(im2, im1), ImageChops.subtract(im1, im2))
im3.show()
im3.save("im3.png")