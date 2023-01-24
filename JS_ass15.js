var arr=[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];
for(var i=0;i<n;i++) {
    for(var j=0;j<n-1;j++) {
        if(arr[j]>arr[j+1]) {
            temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}