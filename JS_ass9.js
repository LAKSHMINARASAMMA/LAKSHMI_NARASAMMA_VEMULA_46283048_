var arr1=[1,2,3];
var arr2=["a","b","c"];
var arr3=[];
var arr_len=arr1.length+arr2.length;
let j=0,k=0;
for(var i=0;i<arr_len;i++){
    if(i%2==0){
        arr3[i]=arr1[k++];
    }else{
        arr3[i]=arr1[j++];
    }
}
console.log(arr3);