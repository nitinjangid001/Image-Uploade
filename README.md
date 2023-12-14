# File Upload Demo

This is a simple Spring Boot project demonstrating file upload functionality. Users can upload files, and the application stores them in the static/images directory.

## How to Use

1. Clone the repository.
2. Build the project using your preferred IDE or build tool.
3. Run the application.

## Endpoints

### Upload File

- *Path:* /upload-file
- *Method:* POST
- *Parameters:*
  - file - The file to be uploaded.

### Example

bash
curl -X POST -H "Content-Type: multipart/form-data" -F "file=@/path/to/your/file.jpg" http://localhost:8080/upload-file


## Project Structure

- *Controller:*
  - Handles incoming requests related to file uploads.
  - Path: com.multipart.demo.ControllerService

- *Service:*
  - Manages file-related operations.
  - Path: com.multipart.demo.FileServices

## Dependencies

- [Spring Framework](https://spring.io/)
- [Java](https://www.java.com/)

## Configuration

The uploaded files are stored in the static/images directory.

## Contributing

Feel free to contribute by opening issues or creating pull requests.
