package com.project.pharmacy.exception;

import java.nio.file.AccessDeniedException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;


/*
- Il RestControllerAdvice, catturerà le eccezioni e modifichera la risposta
	invece di risponderti con un error 500 internal server error, ti rispondera con la classe ErrorResponse
	cattura la Exception e mapperà la risposta, per farla piu parlante.
 */


@RestControllerAdvice
public class GlobalExceptionHandler {

	// Gestisce errori generici (404)
	@ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(NoHandlerFoundException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
            HttpStatus.NOT_FOUND.value(),
            "Endpoint non trovato",
            request.getRequestURI(),
            request.getMethod(),
            LocalDateTime.now(),
            ex.getMessage()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

	// Gestisce errori di validazione (es. parametri errati)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleValidationErrors(MethodArgumentNotValidException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "Errore di validazione", 
				request.getRequestURI(), request.getMethod(), LocalDateTime.now(), ex.getMessage() );

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}

	// Gestisce errori generici (500)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGenericException(Exception ex, HttpServletRequest request) {

		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Errore interno del server", 
				request.getRequestURI(), request.getMethod(), LocalDateTime.now(), ex.getMessage() );

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}


	//  Errore di parsing della richiesta
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ErrorResponse> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				"Errore nella lettura del messaggio",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}

	// Errore di tipo nei parametri della richiesta
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ErrorResponse> handleMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				"Tipo di argomento non valido",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}

	// Errore di autorizzazione
	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<ErrorResponse> handleAccessDenied(AccessDeniedException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.FORBIDDEN.value(),
				"Accesso negato",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorResponse);
	}

	// Errore di violazione dell'integrità dei dati
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ErrorResponse> handleDataIntegrityViolation(DataIntegrityViolationException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.CONFLICT.value(),
				"Conflitto di dati",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
	}

	// Errore di argomenti non validi
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				"Argomento non valido",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}

	// Errore di timeout
	@ExceptionHandler(TimeoutException.class)
	public ResponseEntity<ErrorResponse> handleTimeout(TimeoutException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.REQUEST_TIMEOUT.value(),
				"Tempo di attesa scaduto",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body(errorResponse);
	}


	// Metodo non supportato per la richiesta
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<ErrorResponse> handleMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.METHOD_NOT_ALLOWED.value(),
				"Metodo non consentito",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(errorResponse);
	}

	// Violazioni delle constraint di validazione
	// Se stai usando le annotazioni di validazione su parametri di metodi (come @NotNull, @Size, etc.), Spring solleverà questa eccezione quando la validazione fallisce.
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> handleConstraintViolation(ConstraintViolationException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				"Violazione delle constraint",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
	}

	// Elemento non trovato
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ErrorResponse> handleNoSuchElement(NoSuchElementException ex, HttpServletRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				"Elemento non trovato",
				request.getRequestURI(),
				request.getMethod(),
				LocalDateTime.now(),
				ex.getMessage()
				);

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}

}
