# SpringReactive
Simple implement for reactive programming on Spring Boot to use Spring Webflux

## Non Blocking or Asynchronous 
<img src="https://user-images.githubusercontent.com/58913447/181871686-23d676a3-cdb6-47b4-8f2b-3e8b0be90588.png" width="900" height="350"/>

## Note
- Paradigma pemrograman yang menggunakan pendekatan asinkron dan non blocking
- Jika di model tradisional proses request akan yang di terima oleh server maka akan membuat thread baru dan bersifat singkron dan blocking artinya request akan membentuk antrian atau yang lain akan menunggu request diurutan selanjutnya selesai, baru request selanjutnya akan di proses.
- Pada model tradisional direkomendasikan untuk aplikasi CRUD sedangkan reactive tidak cocok untuk aplikasi CRUD
- Spring web flux full non blocking pemrosesan.
- Request non blocking tidak akan membuat thread baru, akan tetapi setiap request memiliki event handler dan call back information. event handler digunakan untuk menghandle setiap kegagalan data dan call back digunakan untuk menarik kembali request yang di proses untuk dijadikan respon.
- Pada spring boot implementasi untuk spring reactive adalah spring webflux.
- Didalam kode spring webflux, tidak diperbolehkan menggunakan operasi yang sifatnya blocking.
- Request yang diterima server akan bersifat asinkron, jadi tidak menunggu request lain selesai di proses, akan tetapi request yang sudah siap akan di proses.
- Tidak cocok atau tidak bisa digunakan pada database yang sifatnya blocking (RDBMS) dan hanya bisa digunakan pada database yang mendukung reactive (contohnya mongoDB)
- Pada aplikasi reactive dapat diskalakan, efisien dan pemrosesan request dilakukan secara bersamaan
- Semua data yang di proses dan di hasilkan bersifat stream
- Flux adalah operator yang digunakan untuk menghandle response yang memiliki object lebih dari satu, sedangkan Mono akan menghandle object hanya satu.
