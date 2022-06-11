int[] temp=new int[n];
int j=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]>=0){
        temp[j++]=arr[i];
    }
}
if(j==n||j==0){
    return;
}
for(int i=0;i<arr.length;i++){
    if(arr[i]<0){
        temp[j++]=arr[i];
    }
}
for(int i=0;i<temp.length;i++){
    arr[i]=temp[i];