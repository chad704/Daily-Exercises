slideShow = {
    photoList: ['Photo1', 'Photo2', 'Photo3', 'Photo4'],
    currentPhotoIndex: 0,
    nextPhoto: function () {
        if (this.currentPhotoIndex <= this.photoList.length - 1) {
            console.log("End of Slideshow");
        } else {
            this.currentPhotoIndex++;
            console.log(this.photoList[this.currentPhotoIndex]);
        }
    },
    prevPhoto: function () {
        if (this.currentPhotoIndex == -1) {
            console.log("Beginning of Slideshow");
        }else{
            this.currentPhotoIndex--;
            console.log(this.photoList[this.currentPhotoIndex]);
        }
    },
    currentPhoto: function(){
        return this.photoList[this.currentPhotoIndex];
    }
}