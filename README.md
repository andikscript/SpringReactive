# SpringReactive
Simple implement for reactive programming on Spring Boot to use Spring Webflux

### Note
- paradigma pemrograman yang menggunakan pendekatan asinkron dan non blocking
- jika di model tradisional proses request akan yang di terima oleh server maka akan membuat thread baru dan bersifat singkron dan blocking artinya request akan membentuk antrian atau yang lain akan menunggu request diurutan selanjutnya selesai, baru request selanjutnya akan di proses.
- pada model tradisional direkomendasikan untuk aplikasi CRUD sedangkan reactive tidak cocok untuk aplikasi CRUD
- spring web flux full non blocking pemrosesan.
- request non blocking tidak akan membuat thread baru, akan tetapi setiap request memiliki event handler dan call back information. event handler digunakan untuk menghandle setiap kegagalan data dan call back digunakan untuk menarik kembali request yang di proses untuk dijadikan respon.
- pada spring boot implementasi untuk spring reactive adalah spring webflux.
- didalam kode spring webflux, tidak diperbolehkan menggunakan operasi yang sifatnya blocking.
- request yang diterima server akan bersifat asinkron, jadi tidak menunggu request lain selesai di proses, akan tetapi request yang sudah siap akan di proses.
- tidak cocok atau tidak bisa digunakan pada database yang sifatnya blocking (RDBMS) dan hanya bisa digunakan pada database yang mendukung reactive (contohnya mongoDB)
- pada aplikasi reactive dapat diskalakan, efisien dan pemrosesan request dilakukan secara bersamaan
- semua data yang di proses dan di hasilkan bersifat stream
- flux adalah operator yang digunakan untuk menghandle response yang memiliki object lebih dari satu, sedangkan Mono akan menghandle object hanya satu.
